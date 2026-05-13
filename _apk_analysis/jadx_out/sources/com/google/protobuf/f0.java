package com.google.protobuf;

/* JADX INFO: compiled from: OneofInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f23641id;
    private final java.lang.reflect.Field valueField;

    public f0(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f23641id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f23641id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
