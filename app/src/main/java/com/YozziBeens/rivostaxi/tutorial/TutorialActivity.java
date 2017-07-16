package com.YozziBeens.rivostaxi.tutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.View;


import com.YozziBeens.rivostaxi.R;
import com.YozziBeens.rivostaxi.tutorial.view.SmoothFrameLayout;
import com.YozziBeens.rivostaxi.tutorial.view.ViewPagerCustomDuration;
import com.YozziBeens.rivostaxi.utilerias.Preferencias;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class TutorialActivity extends ActionBarActivity {

    private static final int colorArray[] = new int[3];
    @InjectView(R.id.pager)
    ViewPagerCustomDuration viewPager;
    @InjectView(R.id.indicator)
    CirclePageIndicator circleIndicator;
    @InjectView(R.id.next_btn)
    View nextBtn;
    @InjectView(R.id.skip_btn)
    View skipBtn;
    @InjectView(R.id.done_btn)
    View doneBtn;
    @InjectView(R.id.bg)
    SmoothFrameLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        getWindow().setBackgroundDrawable(null);
        ButterKnife.inject(this);
        colorArray[0] = getResources().getColor(R.color.page_blue);
        colorArray[1] = getResources().getColor(R.color.page_red);
        colorArray[2] = getResources().getColor(R.color.page_green);
        bg.setColors(colorArray);
        viewPager.setScrollDurationFactor(1.7);
        viewPager.setOffscreenPageLimit(3);
        final TutorialPagerAdapter defaultPagerAdapter = new TutorialPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(defaultPagerAdapter);
        circleIndicator.setViewPager(viewPager);
        circleIndicator.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            private int mScrollState;

            @Override
            public void onPageSelected(int position) {
                if (mScrollState == ViewPager.SCROLL_STATE_IDLE) {
                    bg.onViewPagerPageChanged(position, 0f);
                }
                switchSkipAndNextButton(position);
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int tabStripChildCount = colorArray.length;
                if ((tabStripChildCount == 0) || (position < 0) || (position >= tabStripChildCount)) {
                    return;
                }
                bg.onViewPagerPageChanged(position, positionOffset);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                mScrollState = state;
            }

        });

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        final int pageWidth = metrics.widthPixels;
        final float ratioIcon = 0.3f * (float) pageWidth;
        final float ratioIconLarge = 0.6f * (float) pageWidth;
        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View view, float position) {
                if (position > -1 && position < 1) {
                    view.findViewById(R.id.image_icon).setTranslationX(position * ratioIcon);
                    //view.findViewById(R.id.image_large).setTranslationX(position * ratioIconLarge);
                }
            }
        });
    }

    @OnClick({R.id.skip_btn, R.id.done_btn})
    public void skipClicked() {
        //startActivity(new Intent(this, TutorialActivity.class));
        Preferencias preferencias= new Preferencias(getApplicationContext());
        preferencias.setTutorial(false);
        finish();
    }

    @OnClick(R.id.next_btn)
    public void nextClicked() {
        if (viewPager.getCurrentItem() < colorArray.length) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            Preferencias preferencias= new Preferencias(getApplicationContext());
            preferencias.setTutorial(false);
        }
    }

    public void switchSkipAndNextButton(int position) {
        if (skipBtn.getVisibility() == View.VISIBLE && position == colorArray.length - 1) {
            doneBtn.setVisibility(View.VISIBLE);
            skipBtn.setVisibility(View.INVISIBLE);
            nextBtn.setVisibility(View.INVISIBLE);
        } else if (position <= colorArray.length && skipBtn.getVisibility() == View.INVISIBLE) {
            skipBtn.setVisibility(View.VISIBLE);
            nextBtn.setVisibility(View.VISIBLE);
            doneBtn.setVisibility(View.INVISIBLE);
        }
    }

    public static class TutorialPagerAdapter extends FragmentPagerAdapter {

        public TutorialPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return TutorialFragment.newInstance(i);
        }

        @Override
        public int getCount() {
            return colorArray.length;
        }
    }
}