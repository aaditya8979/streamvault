package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f32673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f32674c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f32672a = str;
        this.f32673b = list;
        this.f32674c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f32674c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f32672a = str;
        this.f32673b = list;
        this.f32674c = list2;
    }

    public String getMetaDataKey() {
        return this.f32672a;
    }

    public List<String> getMetaDataValue() {
        return this.f32673b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f32674c;
    }
}
