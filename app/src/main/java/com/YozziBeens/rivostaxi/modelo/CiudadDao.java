package com.YozziBeens.rivostaxi.modelo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.YozziBeens.rivostaxi.modelo.Ciudad;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CIUDAD.
*/
public class CiudadDao extends AbstractDao<Ciudad, Long> {

    public static final String TABLENAME = "CIUDAD";

    /**
     * Properties of entity Ciudad.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property CiudadID = new Property(0, Long.class, "ciudadID", true, "CIUDAD_ID");
        public final static Property NombreCiudad = new Property(1, String.class, "nombreCiudad", false, "NOMBRE_CIUDAD");
        public final static Property LowerLeftLatitude = new Property(2, Double.class, "lowerLeftLatitude", false, "LOWER_LEFT_LATITUDE");
        public final static Property LowerLeftLongitude = new Property(3, Double.class, "lowerLeftLongitude", false, "LOWER_LEFT_LONGITUDE");
        public final static Property UpperRightLatitude = new Property(4, Double.class, "upperRightLatitude", false, "UPPER_RIGHT_LATITUDE");
        public final static Property UpperRightLongitude = new Property(5, Double.class, "upperRightLongitude", false, "UPPER_RIGHT_LONGITUDE");
        public final static Property Latitud = new Property(6, Double.class, "latitud", false, "LATITUD");
        public final static Property Longitud = new Property(7, Double.class, "longitud", false, "LONGITUD");
        public final static Property Zoom = new Property(8, Integer.class, "zoom", false, "ZOOM");
    };


    public CiudadDao(DaoConfig config) {
        super(config);
    }
    
    public CiudadDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CIUDAD' (" + //
                "'CIUDAD_ID' INTEGER PRIMARY KEY ," + // 0: ciudadID
                "'NOMBRE_CIUDAD' TEXT NOT NULL ," + // 1: nombreCiudad
                "'LOWER_LEFT_LATITUDE' REAL," + // 2: lowerLeftLatitude
                "'LOWER_LEFT_LONGITUDE' REAL," + // 3: lowerLeftLongitude
                "'UPPER_RIGHT_LATITUDE' REAL," + // 4: upperRightLatitude
                "'UPPER_RIGHT_LONGITUDE' REAL," + // 5: upperRightLongitude
                "'LATITUD' REAL," + // 6: latitud
                "'LONGITUD' REAL," + // 7: longitud
                "'ZOOM' INTEGER);"); // 8: zoom
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CIUDAD'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Ciudad entity) {
        stmt.clearBindings();
 
        Long ciudadID = entity.getCiudadID();
        if (ciudadID != null) {
            stmt.bindLong(1, ciudadID);
        }
        stmt.bindString(2, entity.getNombreCiudad());
 
        Double lowerLeftLatitude = entity.getLowerLeftLatitude();
        if (lowerLeftLatitude != null) {
            stmt.bindDouble(3, lowerLeftLatitude);
        }
 
        Double lowerLeftLongitude = entity.getLowerLeftLongitude();
        if (lowerLeftLongitude != null) {
            stmt.bindDouble(4, lowerLeftLongitude);
        }
 
        Double upperRightLatitude = entity.getUpperRightLatitude();
        if (upperRightLatitude != null) {
            stmt.bindDouble(5, upperRightLatitude);
        }
 
        Double upperRightLongitude = entity.getUpperRightLongitude();
        if (upperRightLongitude != null) {
            stmt.bindDouble(6, upperRightLongitude);
        }
 
        Double latitud = entity.getLatitud();
        if (latitud != null) {
            stmt.bindDouble(7, latitud);
        }
 
        Double longitud = entity.getLongitud();
        if (longitud != null) {
            stmt.bindDouble(8, longitud);
        }
 
        Integer zoom = entity.getZoom();
        if (zoom != null) {
            stmt.bindLong(9, zoom);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Ciudad readEntity(Cursor cursor, int offset) {
        Ciudad entity = new Ciudad( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // ciudadID
            cursor.getString(offset + 1), // nombreCiudad
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // lowerLeftLatitude
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // lowerLeftLongitude
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // upperRightLatitude
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // upperRightLongitude
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // latitud
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // longitud
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8) // zoom
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Ciudad entity, int offset) {
        entity.setCiudadID(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombreCiudad(cursor.getString(offset + 1));
        entity.setLowerLeftLatitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setLowerLeftLongitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setUpperRightLatitude(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setUpperRightLongitude(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setLatitud(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setLongitud(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setZoom(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Ciudad entity, long rowId) {
        entity.setCiudadID(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Ciudad entity) {
        if(entity != null) {
            return entity.getCiudadID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
