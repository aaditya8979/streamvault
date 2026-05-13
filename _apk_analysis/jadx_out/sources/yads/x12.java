package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class x12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f96595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f96596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f96597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f96598d = cn.w.m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f96599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f96600f;

    public x12(View view, Map map) {
        this.f96595a = view;
        this.f96599e = kotlin.collections.a.C(map);
    }

    public final Map a() {
        return this.f96599e;
    }

    public final List b() {
        return this.f96598d;
    }

    public final ImageView c() {
        return this.f96600f;
    }

    public final CheckBox d() {
        return this.f96596b;
    }

    public final View e() {
        return this.f96595a;
    }

    public final ProgressBar f() {
        return this.f96597c;
    }
}
