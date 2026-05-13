package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class q12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f93858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q22 f93859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f93860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f93861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f93862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f93863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f93864g = cn.w.m();

    public q12(View view, q22 q22Var, Map map) {
        this.f93858a = view;
        this.f93859b = q22Var;
        this.f93862e = kotlin.collections.a.C(map);
    }

    public final Map a() {
        return this.f93862e;
    }

    public final List b() {
        return this.f93864g;
    }

    public final ImageView c() {
        return this.f93863f;
    }

    public final CheckBox d() {
        return this.f93860c;
    }

    public final View e() {
        return this.f93858a;
    }

    public final q22 f() {
        return this.f93859b;
    }

    public final ProgressBar g() {
        return this.f93861d;
    }
}
