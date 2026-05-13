package com.mgs.carparking.db;

import zb.b;

/* JADX INFO: loaded from: classes7.dex */
public class LocalDataSourceImpl implements b {
    private static volatile LocalDataSourceImpl INSTANCE;

    private LocalDataSourceImpl() {
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public static LocalDataSourceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (LocalDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LocalDataSourceImpl();
                }
            }
        }
        return INSTANCE;
    }
}
