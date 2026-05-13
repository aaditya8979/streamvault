package ud;

import ab.k;
import ab.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.dramarush.shortin.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;
import com.yalantis.ucrop.a;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import la.j;
import ra.b0;
import ra.l;
import rf.c;
import vs.e;
import vs.h;
import vs.i;

/* JADX INFO: compiled from: PhotoUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f85631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static za.a f85632b;

    /* JADX INFO: compiled from: PhotoUtil.java */
    public class a implements b0<LocalMedia> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ud.b f85633a;

        public a(ud.b bVar) {
            this.f85633a = bVar;
        }

        @Override // ra.b0
        public void a(ArrayList<LocalMedia> arrayList) {
            ud.b bVar = this.f85633a;
            if (bVar != null) {
                bVar.a(arrayList, 0);
            }
        }

        @Override // ra.b0
        public void onCancel() {
        }
    }

    /* JADX INFO: compiled from: PhotoUtil.java */
    public class b implements b0<LocalMedia> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ud.b f85635a;

        public b(ud.b bVar) {
            this.f85635a = bVar;
        }

        @Override // ra.b0
        public void a(ArrayList<LocalMedia> arrayList) {
            ud.b bVar = this.f85635a;
            if (bVar != null) {
                bVar.a(arrayList, 0);
            }
        }

        @Override // ra.b0
        public void onCancel() {
        }
    }

    /* JADX INFO: compiled from: PhotoUtil.java */
    public static class c implements oa.b {

        /* JADX INFO: compiled from: PhotoUtil.java */
        public class a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f85637a;

            public a(l lVar) {
                this.f85637a = lVar;
            }

            @Override // vs.h
            public void a(String str, File file) {
                l lVar = this.f85637a;
                if (lVar != null) {
                    lVar.a(str, file.getAbsolutePath());
                }
            }

            @Override // vs.h
            public void b(String str, Throwable th2) {
                l lVar = this.f85637a;
                if (lVar != null) {
                    lVar.a(str, null);
                }
            }

            @Override // vs.h
            public void onStart() {
            }
        }

        /* JADX INFO: compiled from: PhotoUtil.java */
        public class b implements vs.a {
            public b() {
            }

            @Override // vs.a
            public boolean a(String str) {
                if (!ma.d.n(str) || ma.d.g(str)) {
                    return !ma.d.m(str);
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: ud.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PhotoUtil.java */
        public class C1069c implements i {
            public C1069c() {
            }

            @Override // vs.i
            public String a(String str) {
                int iLastIndexOf = str.lastIndexOf(".");
                return ab.d.c("CMP_") + (iLastIndexOf != -1 ? str.substring(iLastIndexOf) : ".jpg");
            }
        }

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // oa.b
        public void a(Context context, ArrayList<Uri> arrayList, l lVar) {
            e.k(context).r(arrayList).m(100).t(new C1069c()).l(new b()).s(new a(lVar)).n();
        }
    }

    /* JADX INFO: renamed from: ud.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhotoUtil.java */
    public class C1070d implements oa.d {

        /* JADX INFO: renamed from: ud.d$d$a */
        /* JADX INFO: compiled from: PhotoUtil.java */
        public class a implements rf.c {

            /* JADX INFO: renamed from: ud.d$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PhotoUtil.java */
            public class C1071a extends CustomTarget<Bitmap> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c.a f85643b;

                public C1071a(c.a aVar) {
                    this.f85643b = aVar;
                }

                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(@Nullable Drawable drawable) {
                    c.a aVar = this.f85643b;
                    if (aVar != null) {
                        aVar.a(null);
                    }
                }

                public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
                    c.a aVar = this.f85643b;
                    if (aVar != null) {
                        aVar.a(bitmap);
                    }
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
                    onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
                }
            }

            public a() {
            }

            @Override // rf.c
            public void a(Context context, String str, ImageView imageView) {
                if (ed.l.a(context)) {
                    Glide.with(context).load(str).override(BaseTransientBottomBar.ANIMATION_FADE_DURATION, BaseTransientBottomBar.ANIMATION_FADE_DURATION).into(imageView);
                }
            }

            @Override // rf.c
            public void b(Context context, Uri uri, int i10, int i11, c.a<Bitmap> aVar) {
                Glide.with(context).asBitmap().load(uri).override(i10, i11).into(new C1071a(aVar));
            }
        }

        public C1070d() {
        }

        public /* synthetic */ C1070d(d dVar, a aVar) {
            this();
        }

        @Override // oa.d
        public void a(Fragment fragment, Uri uri, Uri uri2, ArrayList<String> arrayList, int i10) {
            a.C0718a c0718aB = d.this.b(fragment.getContext());
            com.yalantis.ucrop.a aVarI = com.yalantis.ucrop.a.i(uri, uri2, arrayList);
            aVarI.l(c0718aB);
            aVarI.j(new a());
            aVarI.k(fragment.requireActivity(), fragment, i10);
        }
    }

    public static d c() {
        if (f85631a == null) {
            f85631a = new d();
        }
        return f85631a;
    }

    @Nullable
    public static String d(LocalMedia localMedia) {
        if (localMedia == null) {
            return "";
        }
        Log.i("cyp", "文件名: " + localMedia.p());
        String strW = localMedia.w();
        Log.i("cyp", "初始路径:" + localMedia.w());
        Log.i("cyp", "绝对路径:" + localMedia.y());
        Log.i("cyp", "是否压缩:" + localMedia.F());
        if (localMedia.F()) {
            strW = localMedia.i();
            Log.i("cyp", "压缩:" + localMedia.i());
        }
        Log.i("cyp", "是否裁剪:" + localMedia.G());
        if (localMedia.G()) {
            strW = localMedia.m();
            Log.i("cyp", "裁剪路径:" + localMedia.m());
        }
        Log.i("cyp", "是否开启原图:" + localMedia.K());
        Log.i("cyp", "原图路径:" + localMedia.u());
        Log.i("cyp", "沙盒路径:" + localMedia.z());
        Log.i("cyp", "水印路径:" + localMedia.C());
        Log.i("cyp", "视频缩略图:" + localMedia.B());
        Log.i("cyp", "原始宽高: " + localMedia.D() + VastAttributes.HORIZONTAL_POSITION + localMedia.q());
        Log.i("cyp", "裁剪宽高: " + localMedia.k() + VastAttributes.HORIZONTAL_POSITION + localMedia.j());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("文件大小: ");
        sb2.append(k.e(localMedia.A()));
        Log.i("cyp", sb2.toString());
        Log.i("cyp", "文件时长: " + localMedia.o());
        return strW;
    }

    public static za.a f(Context context) {
        if (f85632b == null) {
            f85632b = new za.a();
            TitleBarStyle titleBarStyle = new TitleBarStyle();
            titleBarStyle.x(ContextCompat.getColor(context, R.color.ps_color_white));
            titleBarStyle.z(R.drawable.ic_orange_arrow_down);
            titleBarStyle.A(R.drawable.ps_ic_black_back);
            titleBarStyle.B(ContextCompat.getColor(context, R.color.ps_color_black));
            titleBarStyle.y(ContextCompat.getColor(context, R.color.ps_color_53575e));
            titleBarStyle.v(true);
            BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
            bottomNavBarStyle.w(Color.parseColor("#EEEEEE"));
            bottomNavBarStyle.z(ContextCompat.getColor(context, R.color.ps_color_53575e));
            bottomNavBarStyle.y(ContextCompat.getColor(context, R.color.ps_color_9b));
            bottomNavBarStyle.z(ContextCompat.getColor(context, R.color.ps_color_fa632d));
            bottomNavBarStyle.A(false);
            bottomNavBarStyle.v(ContextCompat.getColor(context, R.color.ps_color_53575e));
            bottomNavBarStyle.x(ContextCompat.getColor(context, R.color.ps_color_53575e));
            SelectMainStyle selectMainStyle = new SelectMainStyle();
            selectMainStyle.g0(ContextCompat.getColor(context, R.color.ps_color_white));
            selectMainStyle.Z(true);
            selectMainStyle.d0(ContextCompat.getColor(context, R.color.ps_color_9b));
            selectMainStyle.f0(ContextCompat.getColor(context, R.color.ps_color_fa632d));
            selectMainStyle.b0(R.drawable.ps_demo_white_preview_selector);
            selectMainStyle.c0(R.drawable.ps_checkbox_selector);
            selectMainStyle.e0(context.getString(R.string.ps_done_front_num));
            selectMainStyle.a0(ContextCompat.getColor(context, R.color.ps_color_white));
            f85632b.h(titleBarStyle);
            f85632b.f(bottomNavBarStyle);
            f85632b.g(selectMainStyle);
        }
        return f85632b;
    }

    @Nullable
    public static String g(int i10, List<LocalMedia> list) {
        return sb.b.a(list) ? "" : d(list.get(i10));
    }

    public final a.C0718a b(Context context) {
        a.C0718a c0718a = new a.C0718a();
        c0718a.i(false);
        c0718a.h(true);
        c0718a.k(true);
        c0718a.l(true);
        c0718a.f(false);
        c0718a.p(1.0f, 1.0f);
        c0718a.g(e(context));
        c0718a.b(false);
        c0718a.d(true);
        c0718a.e(true);
        c0718a.j(100.0f);
        za.a aVar = f85632b;
        if (aVar == null || aVar.c().R() == 0) {
            c0718a.m(ContextCompat.getColor(context, R.color.ps_color_grey));
            c0718a.n(ContextCompat.getColor(context, R.color.ps_color_grey));
            c0718a.o(ContextCompat.getColor(context, R.color.ps_color_white));
        } else {
            SelectMainStyle selectMainStyleC = f85632b.c();
            boolean zU = selectMainStyleC.U();
            int iR = selectMainStyleC.R();
            c0718a.c(zU);
            if (q.c(iR)) {
                c0718a.m(iR);
                c0718a.n(iR);
            } else {
                c0718a.m(ContextCompat.getColor(context, R.color.ps_color_grey));
                c0718a.n(ContextCompat.getColor(context, R.color.ps_color_grey));
            }
            TitleBarStyle titleBarStyleD = f85632b.d();
            if (q.c(titleBarStyleD.q())) {
                c0718a.o(titleBarStyleD.q());
            } else {
                c0718a.o(ContextCompat.getColor(context, R.color.ps_color_white));
            }
        }
        return c0718a;
    }

    public final String e(Context context) {
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), "Sandbox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public void h(Context context, ud.b bVar) {
        a aVar = null;
        j.a(context).c(ma.e.c()).e(1).g(1).d(ud.a.g()).h(f(context)).b(new c(aVar)).c(new C1070d(this, aVar)).a(new a(bVar));
    }

    public void i(Context context, ud.b bVar) {
        a aVar = null;
        j.a(context).b(ma.e.c()).b(new c(aVar)).c(new C1070d(this, aVar)).a(new b(bVar));
    }
}
