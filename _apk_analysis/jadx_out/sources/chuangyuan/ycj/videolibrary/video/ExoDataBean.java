package chuangyuan.ycj.videolibrary.video;

import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ExoDataBean extends View.BaseSavedState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f6587e;

    public ExoDataBean(Parcelable parcelable) {
        super(parcelable);
    }

    public ArrayList<String> c() {
        return this.f6587e;
    }

    public int d() {
        return this.f6585c;
    }

    public int e() {
        return this.f6586d;
    }

    public boolean f() {
        return this.f6584b;
    }

    public void g(boolean z10) {
        this.f6584b = z10;
    }

    public void h(ArrayList<String> arrayList) {
        this.f6587e = arrayList;
    }

    public void i(int i10) {
        this.f6585c = i10;
    }

    public void j(int i10) {
        this.f6586d = i10;
    }
}
