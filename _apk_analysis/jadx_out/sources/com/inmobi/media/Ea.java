package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f25372b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25373a;

    public Ea(Context context, String str) {
        this.f25373a = context.getSharedPreferences(str, 0);
    }

    public static void a(Ea ea2, String str, boolean z10) {
        tn.p.k(str, "key");
        SharedPreferences.Editor editorEdit = ea2.f25373a.edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public final void a(String str, int i10, boolean z10) {
        tn.p.k(str, "key");
        SharedPreferences.Editor editorEdit = this.f25373a.edit();
        editorEdit.putInt(str, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String str, long j10, boolean z10) {
        tn.p.k(str, "key");
        SharedPreferences.Editor editorEdit = this.f25373a.edit();
        editorEdit.putLong(str, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String str, String str2, boolean z10) {
        tn.p.k(str, "key");
        SharedPreferences.Editor editorEdit = this.f25373a.edit();
        editorEdit.putString(str, str2);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final boolean a(String str) {
        tn.p.k(str, "key");
        tn.p.k(str, "key");
        if (!this.f25373a.contains(str)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f25373a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
        return true;
    }
}
