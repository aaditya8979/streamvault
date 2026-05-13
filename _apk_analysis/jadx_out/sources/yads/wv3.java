package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class wv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia f96532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha f96533b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vv3 f96535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ka f96536e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f96540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f96541j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx3 f96534c = new dx3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96537f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f96538g = false;

    public wv3(ha haVar, ia iaVar, String str) {
        ka rv3Var;
        this.f96533b = haVar;
        this.f96532a = iaVar;
        this.f96539h = str;
        a();
        if (iaVar.a() == ja.f91135c || iaVar.a() == ja.f91137e) {
            rv3Var = new rv3(iaVar.d(), str);
        } else {
            rv3Var = new dw3(str, iaVar.c(), iaVar.b());
        }
        this.f96536e = rv3Var;
        this.f96536e.c();
        nw3.a().a(this);
        this.f96536e.a(haVar);
    }

    public final void a() {
        this.f96535d = new vv3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f96538g || ((View) this.f96535d.get()) == view) {
            return;
        }
        this.f96535d = new vv3(view);
        this.f96536e.a();
        Collection<wv3> collectionUnmodifiableCollection = Collections.unmodifiableCollection(nw3.f93027c.f93028a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (wv3 wv3Var : collectionUnmodifiableCollection) {
            if (wv3Var != this && ((View) wv3Var.f96535d.get()) == view) {
                wv3Var.f96535d.clear();
            }
        }
    }

    public final void a(View view, yx0 yx0Var, String str) {
        xw3 xw3Var;
        if (this.f96538g) {
            return;
        }
        dx3 dx3Var = this.f96534c;
        dx3Var.getClass();
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!dx3.f89021b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = dx3Var.f89022a.iterator();
        while (true) {
            if (!it.hasNext()) {
                xw3Var = null;
                break;
            } else {
                xw3Var = (xw3) it.next();
                if (xw3Var.f96910a.get() == view) {
                    break;
                }
            }
        }
        if (xw3Var == null) {
            dx3Var.f89022a.add(new xw3(view, yx0Var, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f96538g) {
            return;
        }
        this.f96535d.clear();
        if (!this.f96538g) {
            this.f96534c.f89022a.clear();
        }
        this.f96538g = true;
        ka kaVar = this.f96536e;
        ix3.f91031a.a((WebView) kaVar.f91524b.get(), "finishSession", kaVar.f91523a);
        nw3 nw3Var = nw3.f93027c;
        boolean z10 = nw3Var.f93029b.size() > 0;
        nw3Var.f93028a.remove(this);
        nw3Var.f93029b.remove(this);
        if (z10 && nw3Var.f93029b.size() <= 0) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            x83 x83Var = x83.f96665g;
            x83Var.getClass();
            Handler handler = x83.f96667i;
            if (handler != null) {
                handler.removeCallbacks(x83.f96669k);
                x83.f96667i = null;
            }
            x83Var.f96670a.clear();
            x83.f96666h.post(new u83(x83Var));
            bw3 bw3Var = bw3.f88180d;
            bw3Var.f94628a = false;
            bw3Var.f94630c = null;
            vw3 vw3Var = jx3VarA.f91416d;
            vw3Var.f96213b.getContentResolver().unregisterContentObserver(vw3Var);
        }
        this.f96536e.b();
        this.f96536e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        if (this.f96537f || this.f96536e == null) {
            return;
        }
        this.f96537f = true;
        nw3 nw3Var = nw3.f93027c;
        boolean z10 = nw3Var.f93029b.size() > 0;
        nw3Var.f93029b.add(this);
        if (!z10) {
            jx3 jx3VarA = jx3.a();
            jx3VarA.getClass();
            bw3 bw3Var = bw3.f88180d;
            bw3Var.f94630c = jx3VarA;
            bw3Var.b();
            x83.f96665g.getClass();
            if (x83.f96667i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                x83.f96667i = handler;
                handler.post(x83.f96668j);
                x83.f96667i.postDelayed(x83.f96669k, 200L);
            }
            vw3 vw3Var = jx3VarA.f91416d;
            vw3Var.f96219h.submit(new qw3(vw3Var));
            vw3Var.f96213b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, vw3Var);
        }
        float f10 = jx3.a().f91413a;
        ka kaVar = this.f96536e;
        ix3 ix3Var = ix3.f91031a;
        ix3Var.a((WebView) kaVar.f91524b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f91523a);
        ka kaVar2 = this.f96536e;
        Date date = pv3.f93801f.f93803b;
        Date date2 = date != null ? (Date) date.clone() : null;
        kaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            lw3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            ix3Var.a((WebView) kaVar2.f91524b.get(), "setLastActivity", jSONObject);
        }
        this.f96536e.a(this, this.f96532a);
    }
}
