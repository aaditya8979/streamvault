package com.luck.picture.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.animators.AlphaInAnimationAdapter;
import com.luck.picture.lib.animators.SlideInBottomAnimationAdapter;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.GridSpacingItemDecoration;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.RecyclerPreloadView;
import com.luck.picture.lib.widget.SlideSelectTouchListener;
import com.luck.picture.lib.widget.TitleBar;
import com.luck.picture.lib.widget.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import na.a;
import ra.a0;
import ra.c0;
import ra.x;
import ra.y;
import ra.z;

/* JADX INFO: loaded from: classes6.dex */
public class PictureSelectorFragment extends PictureCommonFragment implements x {
    public static final String C = PictureSelectorFragment.class.getSimpleName();
    public static int D = 135;
    public static final Object E = new Object();
    public na.a A;
    public SlideSelectTouchListener B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerPreloadView f34716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TitleBar f34718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public BottomNavBar f34719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CompleteSelectView f34720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f34721s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34723u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f34726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34727y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PictureImageGridAdapter f34728z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f34722t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f34724v = -1;

    public class a implements ra.t<LocalMediaFolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f34729a;

        public a(boolean z10) {
            this.f34729a = z10;
        }

        @Override // ra.t
        public void a(List<LocalMediaFolder> list) {
            PictureSelectorFragment.this.K1(this.f34729a, list);
        }
    }

    public class b extends ra.u<LocalMedia> {
        public b() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.L1(arrayList, z10);
        }
    }

    public class c extends ra.u<LocalMedia> {
        public c() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.L1(arrayList, z10);
        }
    }

    public class d implements ra.s<LocalMediaFolder> {
        public d() {
        }

        @Override // ra.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment.this.M1(localMediaFolder);
        }
    }

    public class e implements ra.s<LocalMediaFolder> {
        public e() {
        }

        @Override // ra.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment.this.M1(localMediaFolder);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f34716n.scrollToPosition(PictureSelectorFragment.this.f34724v);
            PictureSelectorFragment.this.f34716n.setLastVisiblePosition(PictureSelectorFragment.this.f34724v);
        }
    }

    public class g implements PictureImageGridAdapter.b {
        public g() {
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public int a(View view, int i10, LocalMedia localMedia) {
            int iU = PictureSelectorFragment.this.u(localMedia, view.isSelected());
            if (iU == 0) {
                c0 c0Var = PictureSelectionConfig.f34995o1;
                if (c0Var != null) {
                    long jA = c0Var.a(view);
                    if (jA > 0) {
                        int unused = PictureSelectorFragment.D = (int) jA;
                    }
                } else {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(PictureSelectorFragment.this.getContext(), R$anim.ps_anim_modal_in);
                    int unused2 = PictureSelectorFragment.D = (int) animationLoadAnimation.getDuration();
                    view.startAnimation(animationLoadAnimation);
                }
            }
            return iU;
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void b() {
            if (ab.f.a()) {
                return;
            }
            PictureSelectorFragment.this.u0();
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void c(View view, int i10, LocalMedia localMedia) {
            if (PictureSelectorFragment.this.f34945f.f35017k != 1 || !PictureSelectorFragment.this.f34945f.f35003d) {
                if (ab.f.a()) {
                    return;
                }
                PictureSelectorFragment.this.f2(i10, false);
            } else {
                va.a.h();
                if (PictureSelectorFragment.this.u(localMedia, false) == 0) {
                    PictureSelectorFragment.this.H();
                }
            }
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.b
        public void d(View view, int i10) {
            if (PictureSelectorFragment.this.B == null || !PictureSelectorFragment.this.f34945f.A0) {
                return;
            }
            ((Vibrator) PictureSelectorFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            PictureSelectorFragment.this.B.p(i10);
        }
    }

    public class h implements z {
        public h() {
        }

        @Override // ra.z
        public void a() {
            oa.f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.d(PictureSelectorFragment.this.getContext());
            }
        }

        @Override // ra.z
        public void b() {
            oa.f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.b(PictureSelectorFragment.this.getContext());
            }
        }
    }

    public class i implements y {
        public i() {
        }

        @Override // ra.y
        public void a(int i10) {
            if (i10 == 1) {
                PictureSelectorFragment.this.p2();
            } else if (i10 == 0) {
                PictureSelectorFragment.this.Q1();
            }
        }

        @Override // ra.y
        public void b(int i10, int i11) {
            PictureSelectorFragment.this.o2();
        }
    }

    public class j implements a.InterfaceC0413a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashSet f34739a;

        public j(HashSet hashSet) {
            this.f34739a = hashSet;
        }

        @Override // com.luck.picture.lib.widget.a.InterfaceC0413a
        public void a(int i10, int i11, boolean z10, boolean z11) {
            ArrayList<LocalMedia> arrayListD = PictureSelectorFragment.this.f34728z.d();
            if (arrayListD.size() == 0 || i10 > arrayListD.size()) {
                return;
            }
            LocalMedia localMedia = arrayListD.get(i10);
            PictureSelectorFragment.this.B.m(PictureSelectorFragment.this.u(localMedia, va.a.n().contains(localMedia)) != -1);
        }

        @Override // com.luck.picture.lib.widget.a.InterfaceC0413a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HashSet<Integer> getSelection() {
            for (int i10 = 0; i10 < va.a.l(); i10++) {
                this.f34739a.add(Integer.valueOf(va.a.n().get(i10).f35071n));
            }
            return this.f34739a;
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f34728z.notifyDataSetChanged();
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34742b;

        public l(ArrayList arrayList) {
            this.f34742b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.n2(this.f34742b);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.a2();
        }
    }

    public class n extends ra.u<LocalMedia> {
        public n() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.N1(arrayList, z10);
        }
    }

    public class o extends ra.u<LocalMedia> {
        public o() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorFragment.this.N1(arrayList, z10);
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureSelectorFragment.this.f34945f.O && va.a.l() == 0) {
                PictureSelectorFragment.this.f0();
            } else {
                PictureSelectorFragment.this.H();
            }
        }
    }

    public class q extends TitleBar.a {
        public q() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void a() {
            if (PictureSelectorFragment.this.A.isShowing()) {
                PictureSelectorFragment.this.A.dismiss();
            } else {
                PictureSelectorFragment.this.j0();
            }
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void b(View view) {
            PictureSelectorFragment.this.A.showAsDropDown(view);
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void c() {
            if (PictureSelectorFragment.this.f34945f.f35016j0) {
                if (SystemClock.uptimeMillis() - PictureSelectorFragment.this.f34722t < 500 && PictureSelectorFragment.this.f34728z.getItemCount() > 0) {
                    PictureSelectorFragment.this.f34716n.scrollToPosition(0);
                } else {
                    PictureSelectorFragment.this.f34722t = SystemClock.uptimeMillis();
                }
            }
        }
    }

    public class r implements a.d {
        public r() {
        }

        @Override // na.a.d
        public void a() {
            if (PictureSelectorFragment.this.f34945f.f35028p0) {
                return;
            }
            ab.b.a(PictureSelectorFragment.this.f34718p.getImageArrow(), true);
        }

        @Override // na.a.d
        public void b() {
            if (PictureSelectorFragment.this.f34945f.f35028p0) {
                return;
            }
            ab.b.a(PictureSelectorFragment.this.f34718p.getImageArrow(), false);
        }
    }

    public class s implements xa.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f34750a;

        public s(String[] strArr) {
            this.f34750a = strArr;
        }

        @Override // xa.c
        public void a() {
            PictureSelectorFragment.this.Q(this.f34750a);
        }

        @Override // xa.c
        public void onGranted() {
            PictureSelectorFragment.this.I1();
        }
    }

    public class t implements a0 {
        public t() {
        }
    }

    public class u implements ra.a {

        public class a extends ra.u<LocalMedia> {
            public a() {
            }

            @Override // ra.u
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                PictureSelectorFragment.this.P1(arrayList, z10);
            }
        }

        public class b extends ra.u<LocalMedia> {
            public b() {
            }

            @Override // ra.u
            public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
                PictureSelectorFragment.this.P1(arrayList, z10);
            }
        }

        public u() {
        }

        @Override // ra.a
        public void a(int i10, LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment pictureSelectorFragment = PictureSelectorFragment.this;
            pictureSelectorFragment.f34727y = pictureSelectorFragment.f34945f.E && localMediaFolder.c() == -1;
            PictureSelectorFragment.this.f34728z.l(PictureSelectorFragment.this.f34727y);
            PictureSelectorFragment.this.f34718p.setTitle(localMediaFolder.h());
            LocalMediaFolder localMediaFolderJ = va.a.j();
            long jC = localMediaFolderJ.c();
            if (PictureSelectorFragment.this.f34945f.f35008f0) {
                if (localMediaFolder.c() != jC) {
                    localMediaFolderJ.n(PictureSelectorFragment.this.f34728z.d());
                    localMediaFolderJ.m(PictureSelectorFragment.this.f34943d);
                    localMediaFolderJ.s(PictureSelectorFragment.this.f34716n.a());
                    if (localMediaFolder.e().size() <= 0 || localMediaFolder.j()) {
                        PictureSelectorFragment.this.f34943d = 1;
                        oa.e eVar = PictureSelectionConfig.R0;
                        if (eVar != null) {
                            eVar.d(PictureSelectorFragment.this.getContext(), localMediaFolder.c(), PictureSelectorFragment.this.f34943d, PictureSelectorFragment.this.f34945f.f35006e0, new a());
                        } else {
                            PictureSelectorFragment.this.f34944e.h(localMediaFolder.c(), PictureSelectorFragment.this.f34943d, PictureSelectorFragment.this.f34945f.f35006e0, new b());
                        }
                    } else {
                        PictureSelectorFragment.this.m2(localMediaFolder.e());
                        PictureSelectorFragment.this.f34943d = localMediaFolder.d();
                        PictureSelectorFragment.this.f34716n.setEnabledLoadMore(localMediaFolder.j());
                        PictureSelectorFragment.this.f34716n.smoothScrollToPosition(0);
                    }
                }
            } else if (localMediaFolder.c() != jC) {
                PictureSelectorFragment.this.m2(localMediaFolder.e());
                PictureSelectorFragment.this.f34716n.smoothScrollToPosition(0);
            }
            va.a.p(localMediaFolder);
            PictureSelectorFragment.this.A.dismiss();
            if (PictureSelectorFragment.this.B == null || !PictureSelectorFragment.this.f34945f.A0) {
                return;
            }
            PictureSelectorFragment.this.B.n(PictureSelectorFragment.this.f34728z.g() ? 1 : 0);
        }
    }

    public class v extends BottomNavBar.b {
        public v() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void a() {
            PictureSelectorFragment.this.C0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void d() {
            PictureSelectorFragment.this.f2(0, true);
        }
    }

    public class w implements ra.t<LocalMediaFolder> {
        public w() {
        }

        @Override // ra.t
        public void a(List<LocalMediaFolder> list) {
            PictureSelectorFragment.this.K1(false, list);
        }
    }

    public static PictureSelectorFragment d2() {
        PictureSelectorFragment pictureSelectorFragment = new PictureSelectorFragment();
        pictureSelectorFragment.setArguments(new Bundle());
        return pictureSelectorFragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void F(LocalMedia localMedia) {
        if (!X1(this.A.g())) {
            this.f34728z.d().add(0, localMedia);
            this.f34725w = true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.f35017k == 1 && pictureSelectionConfig.f35003d) {
            va.a.h();
            if (u(localMedia, false) == 0) {
                H();
            }
        } else {
            u(localMedia, false);
        }
        this.f34728z.notifyItemInserted(this.f34945f.E ? 1 : 0);
        PictureImageGridAdapter pictureImageGridAdapter = this.f34728z;
        boolean z10 = this.f34945f.E;
        pictureImageGridAdapter.notifyItemRangeChanged(z10 ? 1 : 0, pictureImageGridAdapter.d().size());
        if (this.f34945f.f35028p0) {
            LocalMediaFolder localMediaFolderJ = va.a.j();
            if (localMediaFolderJ == null) {
                localMediaFolderJ = new LocalMediaFolder();
            }
            localMediaFolderJ.l(ab.s.e(Integer.valueOf(localMedia.v().hashCode())));
            localMediaFolderJ.q(localMedia.v());
            localMediaFolderJ.p(localMedia.s());
            localMediaFolderJ.o(localMedia.w());
            localMediaFolderJ.r(this.f34728z.d().size());
            localMediaFolderJ.m(this.f34943d);
            localMediaFolderJ.s(false);
            localMediaFolderJ.n(this.f34728z.d());
            this.f34716n.setEnabledLoadMore(false);
            va.a.p(localMediaFolderJ);
        } else {
            c2(localMedia);
        }
        this.f34723u = 0;
        if (this.f34728z.d().size() > 0 || this.f34945f.f35003d) {
            R1();
        } else {
            q2();
        }
    }

    public final void G1() {
        this.A.k(new u());
    }

    public final void H1() {
        this.f34728z.m(new g());
        this.f34716n.setOnRecyclerViewScrollStateListener(new h());
        this.f34716n.setOnRecyclerViewScrollListener(new i());
        if (this.f34945f.A0) {
            SlideSelectTouchListener slideSelectTouchListenerR = new SlideSelectTouchListener().n(this.f34728z.g() ? 1 : 0).r(new com.luck.picture.lib.widget.a(new j(new HashSet())));
            this.B = slideSelectTouchListenerR;
            this.f34716n.addOnItemTouchListener(slideSelectTouchListenerR);
        }
    }

    public final void I1() {
        m0(false, null);
        if (this.f34945f.f35028p0) {
            b2();
        } else {
            Y1();
        }
    }

    public final boolean J1(boolean z10) {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (!pictureSelectionConfig.f35012h0) {
            return false;
        }
        if (pictureSelectionConfig.Q) {
            if (pictureSelectionConfig.f35017k == 1) {
                return false;
            }
            if (va.a.l() != this.f34945f.f35019l && (z10 || va.a.l() != this.f34945f.f35019l - 1)) {
                return false;
            }
        } else if (va.a.l() != 0 && (!z10 || va.a.l() != 1)) {
            if (ma.d.i(va.a.o())) {
                PictureSelectionConfig pictureSelectionConfig2 = this.f34945f;
                int i10 = pictureSelectionConfig2.f35023n;
                if (i10 <= 0) {
                    i10 = pictureSelectionConfig2.f35019l;
                }
                if (va.a.l() != i10 && (z10 || va.a.l() != i10 - 1)) {
                    return false;
                }
            } else if (va.a.l() != this.f34945f.f35019l && (z10 || va.a.l() != this.f34945f.f35019l - 1)) {
                return false;
            }
        }
        return true;
    }

    public final void K1(boolean z10, List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolderJ;
        if (ab.a.c(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            q2();
            return;
        }
        if (z10) {
            localMediaFolderJ = list.get(0);
            va.a.p(localMediaFolderJ);
        } else if (va.a.j() != null) {
            localMediaFolderJ = va.a.j();
        } else {
            localMediaFolderJ = list.get(0);
            va.a.p(localMediaFolderJ);
        }
        this.f34718p.setTitle(localMediaFolderJ.h());
        this.A.c(list);
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (!pictureSelectionConfig.f35008f0) {
            m2(localMediaFolderJ.e());
        } else if (pictureSelectionConfig.J0) {
            this.f34716n.setEnabledLoadMore(true);
        } else {
            Z1(localMediaFolderJ.c());
        }
    }

    public final void L1(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (ab.a.c(getActivity())) {
            return;
        }
        this.f34716n.setEnabledLoadMore(z10);
        if (this.f34716n.a() && arrayList.size() == 0) {
            a();
        } else {
            m2(arrayList);
        }
    }

    public final void M1(LocalMediaFolder localMediaFolder) {
        if (ab.a.c(getActivity())) {
            return;
        }
        String str = this.f34945f.Z;
        boolean z10 = localMediaFolder != null;
        this.f34718p.setTitle(z10 ? localMediaFolder.h() : new File(str).getName());
        if (!z10) {
            q2();
        } else {
            va.a.p(localMediaFolder);
            m2(localMediaFolder.e());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        int iA = ma.b.a(getContext(), 1);
        return iA != 0 ? iA : R$layout.ps_fragment_selector;
    }

    public final void N1(List<LocalMedia> list, boolean z10) {
        if (ab.a.c(getActivity())) {
            return;
        }
        this.f34716n.setEnabledLoadMore(z10);
        if (this.f34716n.a()) {
            k2(list);
            if (list.size() > 0) {
                int size = this.f34728z.d().size();
                this.f34728z.d().addAll(list);
                PictureImageGridAdapter pictureImageGridAdapter = this.f34728z;
                pictureImageGridAdapter.notifyItemRangeChanged(size, pictureImageGridAdapter.getItemCount());
                R1();
            } else {
                a();
            }
            if (list.size() < 10) {
                RecyclerPreloadView recyclerPreloadView = this.f34716n;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.f34716n.getScrollY());
            }
        }
    }

    public final void O1(List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolderJ;
        if (ab.a.c(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            q2();
            return;
        }
        if (va.a.j() != null) {
            localMediaFolderJ = va.a.j();
        } else {
            localMediaFolderJ = list.get(0);
            va.a.p(localMediaFolderJ);
        }
        this.f34718p.setTitle(localMediaFolderJ.h());
        this.A.c(list);
        if (this.f34945f.f35008f0) {
            L1(new ArrayList<>(va.a.k()), true);
        } else {
            m2(localMediaFolderJ.e());
        }
    }

    public final void P1(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (ab.a.c(getActivity())) {
            return;
        }
        this.f34716n.setEnabledLoadMore(z10);
        if (arrayList.size() == 0) {
            this.f34728z.d().clear();
        }
        m2(arrayList);
        this.f34716n.onScrolled(0, 0);
        this.f34716n.smoothScrollToPosition(0);
    }

    public final void Q1() {
        if (!this.f34945f.f35048z0 || this.f34728z.d().size() <= 0) {
            return;
        }
        this.f34721s.animate().setDuration(250L).alpha(0.0f).start();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void R(String[] strArr) {
        m0(false, null);
        boolean z10 = strArr.length > 0 && TextUtils.equals(strArr[0], xa.b.f86888b[0]);
        ra.p pVar = PictureSelectionConfig.f34981a1;
        if (pVar != null ? pVar.a(this, strArr) : xa.a.h(getContext(), strArr)) {
            if (z10) {
                u0();
            } else {
                I1();
            }
        } else if (z10) {
            ab.r.c(getContext(), getString(R$string.ps_camera));
        } else {
            ab.r.c(getContext(), getString(R$string.ps_jurisdiction));
            j0();
        }
        xa.b.f86887a = new String[0];
    }

    public final void R1() {
        if (this.f34717o.getVisibility() == 0) {
            this.f34717o.setVisibility(8);
        }
    }

    public final void S1() {
        na.a aVarD = na.a.d(getContext());
        this.A = aVarD;
        aVarD.l(new r());
        G1();
    }

    public final void T1() {
        this.f34719q.f();
        this.f34719q.setOnBottomNavBarListener(new v());
        this.f34719q.h();
    }

    public final void U1() {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.f35017k == 1 && pictureSelectionConfig.f35003d) {
            PictureSelectionConfig.T0.d().w(false);
            this.f34718p.getTitleCancelView().setVisibility(0);
            this.f34720r.setVisibility(8);
            return;
        }
        this.f34720r.c();
        this.f34720r.setSelectedChange(false);
        if (PictureSelectionConfig.T0.c().T()) {
            if (this.f34720r.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f34720r.getLayoutParams();
                int i10 = R$id.title_bar;
                layoutParams.topToTop = i10;
                ((ConstraintLayout.LayoutParams) this.f34720r.getLayoutParams()).bottomToBottom = i10;
                if (this.f34945f.L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f34720r.getLayoutParams())).topMargin = ab.e.i(getContext());
                }
            } else if ((this.f34720r.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f34945f.L) {
                ((RelativeLayout.LayoutParams) this.f34720r.getLayoutParams()).topMargin = ab.e.i(getContext());
            }
        }
        this.f34720r.setOnClickListener(new p());
    }

    public final void V1(View view) {
        this.f34716n = (RecyclerPreloadView) view.findViewById(R$id.recycler);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iA = selectMainStyleC.A();
        if (ab.q.c(iA)) {
            this.f34716n.setBackgroundColor(iA);
        } else {
            this.f34716n.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
        int i10 = this.f34945f.f35043x;
        if (i10 <= 0) {
            i10 = 4;
        }
        if (this.f34716n.getItemDecorationCount() == 0) {
            if (ab.q.b(selectMainStyleC.o())) {
                this.f34716n.addItemDecoration(new GridSpacingItemDecoration(i10, selectMainStyleC.o(), selectMainStyleC.S()));
            } else {
                this.f34716n.addItemDecoration(new GridSpacingItemDecoration(i10, ab.e.a(view.getContext(), 1.0f), selectMainStyleC.S()));
            }
        }
        this.f34716n.setLayoutManager(new GridLayoutManager(getContext(), i10));
        RecyclerView.ItemAnimator itemAnimator = this.f34716n.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f34716n.setItemAnimator(null);
        }
        if (this.f34945f.f35008f0) {
            this.f34716n.setReachBottomRow(2);
            this.f34716n.setOnRecyclerViewPreloadListener(this);
        } else {
            this.f34716n.setHasFixedSize(true);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(getContext(), this.f34945f);
        this.f34728z = pictureImageGridAdapter;
        pictureImageGridAdapter.l(this.f34727y);
        int i11 = this.f34945f.f35014i0;
        if (i11 == 1) {
            this.f34716n.setAdapter(new AlphaInAnimationAdapter(this.f34728z));
        } else if (i11 != 2) {
            this.f34716n.setAdapter(this.f34728z);
        } else {
            this.f34716n.setAdapter(new SlideInBottomAnimationAdapter(this.f34728z));
        }
        H1();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void W(int i10, String[] strArr) {
        if (i10 != -1) {
            super.W(i10, strArr);
        } else {
            PictureSelectionConfig.f34981a1.b(this, strArr, new t());
        }
    }

    public final void W1() {
        if (PictureSelectionConfig.T0.d().u()) {
            this.f34718p.setVisibility(8);
        }
        this.f34718p.d();
        this.f34718p.setOnTitleBarListener(new q());
    }

    public final boolean X1(int i10) {
        int i11;
        return i10 != 0 && (i11 = this.f34723u) > 0 && i11 < i10;
    }

    public void Y1() {
        oa.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            eVar.b(getContext(), new w());
        } else {
            this.f34944e.f(new a(g2()));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void Z() {
        this.f34719q.g();
    }

    public void Z1(long j10) {
        this.f34943d = 1;
        this.f34716n.setEnabledLoadMore(true);
        oa.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            Context context = getContext();
            int i10 = this.f34943d;
            eVar.d(context, j10, i10, i10 * this.f34945f.f35006e0, new b());
        } else {
            ta.a aVar = this.f34944e;
            int i11 = this.f34943d;
            aVar.h(j10, i11, i11 * this.f34945f.f35006e0, new c());
        }
    }

    @Override // ra.x
    public void a() {
        if (this.f34726x) {
            requireView().postDelayed(new m(), 350L);
        } else {
            a2();
        }
    }

    public void a2() {
        if (this.f34716n.a()) {
            this.f34943d++;
            LocalMediaFolder localMediaFolderJ = va.a.j();
            long jC = localMediaFolderJ != null ? localMediaFolderJ.c() : 0L;
            oa.e eVar = PictureSelectionConfig.R0;
            if (eVar == null) {
                this.f34944e.h(jC, this.f34943d, this.f34945f.f35006e0, new o());
                return;
            }
            Context context = getContext();
            int i10 = this.f34943d;
            int i11 = this.f34945f.f35006e0;
            eVar.c(context, jC, i10, i11, i11, new n());
        }
    }

    public void b2() {
        oa.e eVar = PictureSelectionConfig.R0;
        if (eVar != null) {
            eVar.a(getContext(), new d());
        } else {
            this.f34944e.g(new e());
        }
    }

    public final void c2(LocalMedia localMedia) {
        LocalMediaFolder localMediaFolderH;
        String string;
        List<LocalMediaFolder> listF = this.A.f();
        if (this.A.i() == 0) {
            localMediaFolderH = new LocalMediaFolder();
            if (TextUtils.isEmpty(this.f34945f.f35004d0)) {
                string = getString(this.f34945f.f34999b == ma.e.b() ? R$string.ps_all_audio : R$string.ps_camera_roll);
            } else {
                string = this.f34945f.f35004d0;
            }
            localMediaFolderH.q(string);
            localMediaFolderH.o("");
            localMediaFolderH.l(-1L);
            listF.add(0, localMediaFolderH);
        } else {
            localMediaFolderH = this.A.h(0);
        }
        localMediaFolderH.o(localMedia.w());
        localMediaFolderH.p(localMedia.s());
        localMediaFolderH.n(this.f34728z.d());
        localMediaFolderH.l(-1L);
        localMediaFolderH.r(X1(localMediaFolderH.i()) ? localMediaFolderH.i() : localMediaFolderH.i() + 1);
        LocalMediaFolder localMediaFolderJ = va.a.j();
        if (localMediaFolderJ == null || localMediaFolderJ.i() == 0) {
            va.a.p(localMediaFolderH);
        }
        LocalMediaFolder localMediaFolder = null;
        int i10 = 0;
        while (true) {
            if (i10 >= listF.size()) {
                break;
            }
            LocalMediaFolder localMediaFolder2 = listF.get(i10);
            if (TextUtils.equals(localMediaFolder2.h(), localMedia.v())) {
                localMediaFolder = localMediaFolder2;
                break;
            }
            i10++;
        }
        if (localMediaFolder == null) {
            localMediaFolder = new LocalMediaFolder();
            listF.add(localMediaFolder);
        }
        localMediaFolder.q(localMedia.v());
        if (localMediaFolder.c() == -1 || localMediaFolder.c() == 0) {
            localMediaFolder.l(localMedia.g());
        }
        if (this.f34945f.f35008f0) {
            localMediaFolder.s(true);
        } else if (!X1(localMediaFolderH.i()) || !TextUtils.isEmpty(this.f34945f.X) || !TextUtils.isEmpty(this.f34945f.Y)) {
            localMediaFolder.e().add(0, localMedia);
        }
        localMediaFolder.r(X1(localMediaFolderH.i()) ? localMediaFolder.i() : localMediaFolder.i() + 1);
        localMediaFolder.o(this.f34945f.f35000b0);
        localMediaFolder.p(localMedia.s());
        this.A.c(listF);
    }

    public void e2() {
        la.b bVar = PictureSelectionConfig.f34992l1;
        if (bVar != null) {
            ta.a aVarA = bVar.a();
            this.f34944e = aVarA;
            if (aVarA == null) {
                throw new NullPointerException("No available " + ta.a.class + " loader found");
            }
        } else {
            this.f34944e = this.f34945f.f35008f0 ? new ta.d() : new ta.b();
        }
        this.f34944e.e(getContext(), this.f34945f);
    }

    public final void f2(int i10, boolean z10) {
        ArrayList<LocalMedia> arrayList;
        int i11;
        long jC;
        FragmentActivity activity = getActivity();
        String str = PictureSelectorPreviewFragment.Q;
        if (ab.a.b(activity, str)) {
            if (z10) {
                ArrayList<LocalMedia> arrayList2 = new ArrayList<>(va.a.n());
                jC = 0;
                arrayList = arrayList2;
                i11 = arrayList2.size();
            } else {
                arrayList = new ArrayList<>(this.f34728z.d());
                i11 = va.a.j().i();
                jC = va.a.j().c();
            }
            if (!z10) {
                PictureSelectionConfig pictureSelectionConfig = this.f34945f;
                if (pictureSelectionConfig.M) {
                    ua.a.c(this.f34716n, pictureSelectionConfig.L ? 0 : ab.e.i(getContext()));
                }
            }
            ra.r rVar = PictureSelectionConfig.f34983c1;
            if (rVar != null) {
                rVar.a(getContext(), i10, i11, this.f34943d, jC, this.f34718p.getTitleText(), this.f34728z.g(), arrayList, z10);
            } else if (ab.a.b(getActivity(), str)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragmentP1 = PictureSelectorPreviewFragment.P1();
                pictureSelectorPreviewFragmentP1.e2(z10, this.f34718p.getTitleText(), this.f34728z.g(), i10, i11, this.f34943d, jC, arrayList);
                la.a.a(getActivity(), str, pictureSelectorPreviewFragmentP1);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void g0(LocalMedia localMedia) {
        this.f34728z.h(localMedia.f35071n);
    }

    public final boolean g2() {
        Context contextRequireContext;
        int i10;
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (!pictureSelectionConfig.f35008f0 || !pictureSelectionConfig.J0) {
            return false;
        }
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.l(-1L);
        if (TextUtils.isEmpty(this.f34945f.f35004d0)) {
            TitleBar titleBar = this.f34718p;
            if (this.f34945f.f34999b == ma.e.b()) {
                contextRequireContext = requireContext();
                i10 = R$string.ps_all_audio;
            } else {
                contextRequireContext = requireContext();
                i10 = R$string.ps_camera_roll;
            }
            titleBar.setTitle(contextRequireContext.getString(i10));
        } else {
            this.f34718p.setTitle(this.f34945f.f35004d0);
        }
        localMediaFolder.q(this.f34718p.getTitleText());
        va.a.p(localMediaFolder);
        Z1(localMediaFolder.c());
        return true;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void h0() {
        G0(requireView());
    }

    public void h2(Bundle bundle) {
        if (bundle == null) {
            this.f34727y = this.f34945f.E;
            return;
        }
        this.f34723u = bundle.getInt("com.luck.picture.lib.all_folder_size");
        this.f34943d = bundle.getInt("com.luck.picture.lib.current_page", this.f34943d);
        this.f34724v = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f34724v);
        this.f34727y = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f34945f.E);
    }

    public final void i2() {
        this.f34728z.l(this.f34727y);
        D0(0L);
        if (this.f34945f.f35028p0) {
            M1(va.a.j());
        } else {
            O1(new ArrayList(va.a.i()));
        }
    }

    public final void j2() {
        if (this.f34724v > 0) {
            this.f34716n.post(new f());
        }
    }

    public final void k2(List<LocalMedia> list) {
        try {
            try {
                if (this.f34945f.f35008f0 && this.f34725w) {
                    synchronized (E) {
                        Iterator<LocalMedia> it = list.iterator();
                        while (it.hasNext()) {
                            if (this.f34728z.d().contains(it.next())) {
                                it.remove();
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            this.f34725w = false;
        }
    }

    public final void l2() {
        this.f34728z.l(this.f34727y);
        if (xa.a.f(this.f34945f.f34999b, getContext())) {
            I1();
            return;
        }
        String[] strArrA = xa.b.a(this.f34945f.f34999b);
        m0(true, strArrA);
        if (PictureSelectionConfig.f34981a1 != null) {
            W(-1, strArrA);
        } else {
            xa.a.b().requestPermissions(this, strArrA, new s(strArrA));
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void m2(ArrayList<LocalMedia> arrayList) {
        long jL = L();
        if (jL > 0) {
            requireView().postDelayed(new l(arrayList), jL);
        } else {
            n2(arrayList);
        }
    }

    public final void n2(ArrayList<LocalMedia> arrayList) {
        D0(0L);
        z0(false);
        this.f34728z.k(arrayList);
        va.a.e();
        va.a.f();
        j2();
        if (this.f34728z.f()) {
            q2();
        } else {
            R1();
        }
    }

    public final void o2() {
        int firstVisiblePosition;
        if (!this.f34945f.f35048z0 || (firstVisiblePosition = this.f34716n.getFirstVisiblePosition()) == -1) {
            return;
        }
        ArrayList<LocalMedia> arrayListD = this.f34728z.d();
        if (arrayListD.size() <= firstVisiblePosition || arrayListD.get(firstVisiblePosition).n() <= 0) {
            return;
        }
        this.f34721s.setText(ab.d.e(getContext(), arrayListD.get(firstVisiblePosition).n()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SlideSelectTouchListener slideSelectTouchListener = this.B;
        if (slideSelectTouchListener != null) {
            slideSelectTouchListener.q();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.all_folder_size", this.f34723u);
        bundle.putInt("com.luck.picture.lib.current_page", this.f34943d);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f34716n.getLastVisiblePosition());
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f34728z.g());
        va.a.p(va.a.j());
        va.a.a(this.A.f());
        va.a.b(this.f34728z.d());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        h2(bundle);
        this.f34726x = bundle != null;
        this.f34717o = (TextView) view.findViewById(R$id.tv_data_empty);
        this.f34720r = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f34718p = (TitleBar) view.findViewById(R$id.title_bar);
        this.f34719q = (BottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f34721s = (TextView) view.findViewById(R$id.tv_current_data_time);
        e2();
        S1();
        W1();
        U1();
        V1(view);
        T1();
        if (this.f34726x) {
            i2();
        } else {
            l2();
        }
    }

    public final void p2() {
        if (this.f34945f.f35048z0 && this.f34728z.d().size() > 0 && this.f34721s.getAlpha() == 0.0f) {
            this.f34721s.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    public final void q2() {
        if (va.a.j() == null || va.a.j().c() == -1) {
            if (this.f34717o.getVisibility() == 8) {
                this.f34717o.setVisibility(0);
            }
            this.f34717o.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_no_data, 0, 0);
            this.f34717o.setText(getString(this.f34945f.f34999b == ma.e.b() ? R$string.ps_audio_empty : R$string.ps_empty));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void r0(boolean z10, LocalMedia localMedia) {
        this.f34719q.h();
        this.f34720r.setSelectedChange(false);
        if (J1(z10)) {
            this.f34728z.h(localMedia.f35071n);
            this.f34716n.postDelayed(new k(), D);
        } else {
            this.f34728z.h(localMedia.f35071n);
        }
        if (z10) {
            return;
        }
        z0(true);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void z0(boolean z10) {
        if (PictureSelectionConfig.T0.c().Y()) {
            int i10 = 0;
            while (i10 < va.a.l()) {
                LocalMedia localMedia = va.a.n().get(i10);
                i10++;
                localMedia.l0(i10);
                if (z10) {
                    this.f34728z.h(localMedia.f35071n);
                }
            }
        }
    }
}
