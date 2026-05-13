package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class tg1 implements rg1, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy2 f95208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f95209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn.g f95210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f95211e;

    public tg1(Context context, String str, oy2 oy2Var) {
        this.f95207a = str;
        this.f95208b = oy2Var;
        Context applicationContext = context.getApplicationContext();
        this.f95209c = applicationContext != null ? applicationContext : context;
        this.f95210d = kotlin.b.b(new sg1(this));
        this.f95211e = new LinkedHashSet();
    }

    public final int a(int i10, String str) {
        ((SharedPreferences) this.f95210d.getValue()).contains(str);
        return ((SharedPreferences) this.f95210d.getValue()).getInt(str, i10);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.f95210d.getValue()).getStringSet(str, set);
    }

    public final void a() {
        ((SharedPreferences) this.f95210d.getValue()).edit().clear().apply();
    }

    public final void a(String str, long j10) {
        ((SharedPreferences) this.f95210d.getValue()).edit().putLong(str, j10).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.f95210d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.f95210d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(qg1 qg1Var) {
        if (this.f95211e.isEmpty()) {
            ((SharedPreferences) this.f95210d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f95211e.add(new WeakReference(qg1Var));
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.f95210d.getValue()).contains(str);
    }

    public final boolean a(String str, boolean z10) {
        return ((SharedPreferences) this.f95210d.getValue()).getBoolean(str, z10);
    }

    public final long b(String str) {
        return ((SharedPreferences) this.f95210d.getValue()).getLong(str, 0L);
    }

    public final void b(int i10, String str) {
        ((SharedPreferences) this.f95210d.getValue()).edit().putInt(str, i10).apply();
    }

    public final void b(String str, boolean z10) {
        ((SharedPreferences) this.f95210d.getValue()).edit().putBoolean(str, z10).apply();
    }

    public final String c(String str) {
        return ((SharedPreferences) this.f95210d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.f95210d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f95211e.iterator();
            while (it.hasNext()) {
                qg1 qg1Var = (qg1) ((WeakReference) it.next()).get();
                if (qg1Var != null) {
                    zw zwVar = (zw) qg1Var;
                    synchronized (zw.f97802j) {
                        ix ixVarA = zwVar.f97804c.a(this, str);
                        if (ixVarA == null) {
                            ixVarA = zwVar.f97803b.a(this, str);
                        }
                        if (ixVarA != null) {
                            zwVar.a(ixVarA);
                        }
                        bn.r rVar = bn.r.f5635a;
                    }
                }
            }
        }
    }
}
