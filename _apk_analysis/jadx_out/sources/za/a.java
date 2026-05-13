package za;

import com.luck.picture.lib.style.AlbumWindowStyle;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;

/* JADX INFO: compiled from: PictureSelectorStyle.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlbumWindowStyle f98265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TitleBarStyle f98266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SelectMainStyle f98267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BottomNavBarStyle f98268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PictureWindowAnimationStyle f98269e;

    public AlbumWindowStyle a() {
        AlbumWindowStyle albumWindowStyle = this.f98265a;
        return albumWindowStyle == null ? new AlbumWindowStyle() : albumWindowStyle;
    }

    public BottomNavBarStyle b() {
        BottomNavBarStyle bottomNavBarStyle = this.f98268d;
        return bottomNavBarStyle == null ? new BottomNavBarStyle() : bottomNavBarStyle;
    }

    public SelectMainStyle c() {
        SelectMainStyle selectMainStyle = this.f98267c;
        return selectMainStyle == null ? new SelectMainStyle() : selectMainStyle;
    }

    public TitleBarStyle d() {
        TitleBarStyle titleBarStyle = this.f98266b;
        return titleBarStyle == null ? new TitleBarStyle() : titleBarStyle;
    }

    public PictureWindowAnimationStyle e() {
        if (this.f98269e == null) {
            this.f98269e = PictureWindowAnimationStyle.c();
        }
        return this.f98269e;
    }

    public void f(BottomNavBarStyle bottomNavBarStyle) {
        this.f98268d = bottomNavBarStyle;
    }

    public void g(SelectMainStyle selectMainStyle) {
        this.f98267c = selectMainStyle;
    }

    public void h(TitleBarStyle titleBarStyle) {
        this.f98266b = titleBarStyle;
    }
}
