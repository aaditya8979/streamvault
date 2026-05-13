package com.luck.picture.lib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.adapter.PicturePreviewAdapter;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.HorizontalItemDecoration;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.PreviewBottomNavBar;
import com.luck.picture.lib.widget.PreviewTitleBar;
import com.luck.picture.lib.widget.TitleBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import na.b;
import ra.c0;

/* JADX INFO: loaded from: classes5.dex */
public class PictureSelectorPreviewFragment extends PictureCommonFragment {
    public static final String Q = PictureSelectorPreviewFragment.class.getSimpleName();
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public TextView G;
    public TextView H;
    public View I;
    public CompleteSelectView J;
    public RecyclerView M;
    public PreviewGalleryAdapter N;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicalView f34759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager2 f34760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PicturePreviewAdapter f34761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PreviewBottomNavBar f34762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PreviewTitleBar f34763s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f34766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f34770z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<LocalMedia> f34758n = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f34764t = true;
    public long F = -1;
    public boolean K = true;
    public boolean L = false;
    public List<View> O = new ArrayList();
    public final ViewPager2.OnPageChangeCallback P = new n();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.I.performClick();
        }
    }

    public class a0 implements View.OnClickListener {
        public a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f34770z) {
                pictureSelectorPreviewFragment.y1();
                return;
            }
            LocalMedia localMedia = pictureSelectorPreviewFragment.f34758n.get(pictureSelectorPreviewFragment.f34760p.getCurrentItem());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.u(localMedia, pictureSelectorPreviewFragment2.G.isSelected()) == 0) {
                c0 c0Var = PictureSelectionConfig.f34995o1;
                if (c0Var != null) {
                    c0Var.a(PictureSelectorPreviewFragment.this.G);
                } else {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.G.startAnimation(AnimationUtils.loadAnimation(pictureSelectorPreviewFragment3.getContext(), R$anim.ps_anim_modal_in));
                }
            }
        }
    }

    public class b extends WrapContentLinearLayoutManager {

        public class a extends LinearSmoothScroller {
            public a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 300.0f / displayMetrics.densityDpi;
            }
        }

        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
            super.smoothScrollToPosition(recyclerView, state, i10);
            a aVar = new a(recyclerView.getContext());
            aVar.setTargetPosition(i10);
            startSmoothScroll(aVar);
        }
    }

    public class b0 implements BasePreviewHolder.a {
        public b0() {
        }

        public /* synthetic */ b0(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, k kVar) {
            this();
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void a(LocalMedia localMedia) {
            if (PictureSelectorPreviewFragment.this.f34945f.P) {
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f34770z) {
                pictureSelectorPreviewFragment.U1(localMedia);
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void b(String str) {
            if (!TextUtils.isEmpty(str)) {
                PictureSelectorPreviewFragment.this.f34763s.setTitle(str);
                return;
            }
            PictureSelectorPreviewFragment.this.f34763s.setTitle((PictureSelectorPreviewFragment.this.f34765u + 1) + "/" + PictureSelectorPreviewFragment.this.C);
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.a
        public void onBackPressed() {
            if (PictureSelectorPreviewFragment.this.f34945f.L) {
                PictureSelectorPreviewFragment.this.b2();
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f34770z) {
                if (pictureSelectorPreviewFragment.f34945f.M) {
                    PictureSelectorPreviewFragment.this.f34759o.t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.D1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f34766v || !pictureSelectorPreviewFragment.f34945f.M) {
                PictureSelectorPreviewFragment.this.X();
            } else {
                PictureSelectorPreviewFragment.this.f34759o.t();
            }
        }
    }

    public class c implements PreviewGalleryAdapter.c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f34777b;

            public a(int i10) {
                this.f34777b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PictureSelectorPreviewFragment.this.f34945f.M) {
                    PictureSelectorPreviewFragment.this.f34761q.m(this.f34777b);
                }
            }
        }

        public c() {
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.c
        public void a(int i10, LocalMedia localMedia, View view) {
            String string = TextUtils.isEmpty(PictureSelectorPreviewFragment.this.f34945f.f35004d0) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_camera_roll) : PictureSelectorPreviewFragment.this.f34945f.f35004d0;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f34766v || TextUtils.equals(pictureSelectorPreviewFragment.f34768x, string) || TextUtils.equals(localMedia.v(), PictureSelectorPreviewFragment.this.f34768x)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                if (!pictureSelectorPreviewFragment2.f34766v) {
                    i10 = pictureSelectorPreviewFragment2.f34769y ? localMedia.f35071n - 1 : localMedia.f35071n;
                }
                if (i10 == pictureSelectorPreviewFragment2.f34760p.getCurrentItem() && localMedia.E()) {
                    return;
                }
                LocalMedia localMediaD = PictureSelectorPreviewFragment.this.f34761q.d(i10);
                if ((localMediaD == null || TextUtils.equals(localMedia.w(), localMediaD.w())) && localMedia.r() == localMediaD.r()) {
                    if (PictureSelectorPreviewFragment.this.f34760p.getAdapter() != null) {
                        PictureSelectorPreviewFragment.this.f34760p.setAdapter(null);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                        pictureSelectorPreviewFragment3.f34760p.setAdapter(pictureSelectorPreviewFragment3.f34761q);
                    }
                    PictureSelectorPreviewFragment.this.f34760p.setCurrentItem(i10, false);
                    PictureSelectorPreviewFragment.this.Q1(localMedia);
                    PictureSelectorPreviewFragment.this.f34760p.post(new a(i10));
                }
            }
        }
    }

    public class d extends ItemTouchHelper.Callback {

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.L = true;
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.K = true;
            }
        }

        public d() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            int iH;
            viewHolder.itemView.setAlpha(1.0f);
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.L) {
                pictureSelectorPreviewFragment.L = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.1f, 1.0f));
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.setDuration(50L);
                animatorSet.start();
                animatorSet.addListener(new b());
            }
            super.clearView(recyclerView, viewHolder);
            PictureSelectorPreviewFragment.this.N.notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.f34766v && PictureSelectorPreviewFragment.this.f34760p.getCurrentItem() != (iH = pictureSelectorPreviewFragment2.N.h()) && iH != -1) {
                if (PictureSelectorPreviewFragment.this.f34760p.getAdapter() != null) {
                    PictureSelectorPreviewFragment.this.f34760p.setAdapter(null);
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.f34760p.setAdapter(pictureSelectorPreviewFragment3.f34761q);
                }
                PictureSelectorPreviewFragment.this.f34760p.setCurrentItem(iH, false);
            }
            if (!PictureSelectionConfig.T0.c().Y() || ab.a.c(PictureSelectorPreviewFragment.this.getActivity())) {
                return;
            }
            List<Fragment> fragments = PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).z0(true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i10, float f10, float f11) {
            return super.getAnimationDuration(recyclerView, i10, f10, f11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(0.7f);
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.K) {
                pictureSelectorPreviewFragment.K = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, 1.1f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, 1.1f));
                animatorSet.setDuration(50L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.start();
                animatorSet.addListener(new a());
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            try {
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                    int i10 = absoluteAdapterPosition;
                    while (i10 < absoluteAdapterPosition2) {
                        int i11 = i10 + 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.N.g(), i10, i11);
                        Collections.swap(va.a.n(), i10, i11);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment.f34766v) {
                            Collections.swap(pictureSelectorPreviewFragment.f34758n, i10, i11);
                        }
                        i10 = i11;
                    }
                } else {
                    for (int i12 = absoluteAdapterPosition; i12 > absoluteAdapterPosition2; i12--) {
                        int i13 = i12 - 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.N.g(), i12, i13);
                        Collections.swap(va.a.n(), i12, i13);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment2.f34766v) {
                            Collections.swap(pictureSelectorPreviewFragment2.f34758n, i12, i13);
                        }
                    }
                }
                PictureSelectorPreviewFragment.this.N.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return true;
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i10) {
            super.onSelectedChanged(viewHolder, i10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    public class e implements PreviewGalleryAdapter.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ItemTouchHelper f34782a;

        public e(ItemTouchHelper itemTouchHelper) {
            this.f34782a = itemTouchHelper;
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.d
        public void a(RecyclerView.ViewHolder viewHolder, int i10, View view) {
            ((Vibrator) PictureSelectorPreviewFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            if (PictureSelectorPreviewFragment.this.N.getItemCount() != PictureSelectorPreviewFragment.this.f34945f.f35019l) {
                this.f34782a.startDrag(viewHolder);
            } else if (viewHolder.getLayoutPosition() != PictureSelectorPreviewFragment.this.N.getItemCount() - 1) {
                this.f34782a.startDrag(viewHolder);
            }
        }
    }

    public class f extends BottomNavBar.b {
        public f() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void a() {
            PictureSelectorPreviewFragment.this.C0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void b() {
            if (PictureSelectionConfig.Z0 != null) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                PictureSelectionConfig.Z0.a(PictureSelectorPreviewFragment.this, pictureSelectorPreviewFragment.f34758n.get(pictureSelectorPreviewFragment.f34760p.getCurrentItem()), 696);
            }
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.b
        public void c() {
            int currentItem = PictureSelectorPreviewFragment.this.f34760p.getCurrentItem();
            if (PictureSelectorPreviewFragment.this.f34758n.size() > currentItem) {
                PictureSelectorPreviewFragment.this.u(PictureSelectorPreviewFragment.this.f34758n.get(currentItem), false);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f34761q.j(pictureSelectorPreviewFragment.f34765u);
        }
    }

    public class h implements ra.d<int[]> {
        public h() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.j2(iArr);
        }
    }

    public class i implements ra.d<int[]> {
        public i() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.j2(iArr);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f34788b;

        public j(int[] iArr) {
            this.f34788b = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            MagicalView magicalView = PictureSelectorPreviewFragment.this.f34759o;
            int[] iArr = this.f34788b;
            magicalView.K(iArr[0], iArr[1], false);
        }
    }

    public class k implements ua.c {
        public k() {
        }

        @Override // ua.c
        public void a(boolean z10) {
            PictureSelectorPreviewFragment.this.Z1(z10);
        }

        @Override // ua.c
        public void b(MagicalView magicalView, boolean z10) {
            PictureSelectorPreviewFragment.this.X1(magicalView, z10);
        }

        @Override // ua.c
        public void c() {
            PictureSelectorPreviewFragment.this.a2();
        }

        @Override // ua.c
        public void d(float f10) {
            PictureSelectorPreviewFragment.this.W1(f10);
        }

        @Override // ua.c
        public void e() {
            PictureSelectorPreviewFragment.this.Y1();
        }
    }

    public class l extends AnimatorListenerAdapter {
        public l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PictureSelectorPreviewFragment.this.B = false;
        }
    }

    public class m implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34792a;

        public class a implements ra.d<String> {
            public a() {
            }

            @Override // ra.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                PictureSelectorPreviewFragment.this.E();
                if (TextUtils.isEmpty(str)) {
                    ab.r.c(PictureSelectorPreviewFragment.this.getContext(), ma.d.d(m.this.f34792a.s()) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_save_audio_error) : ma.d.i(m.this.f34792a.s()) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_save_video_error) : PictureSelectorPreviewFragment.this.getString(R$string.ps_save_image_error));
                    return;
                }
                new la.g(PictureSelectorPreviewFragment.this.getActivity(), str);
                ab.r.c(PictureSelectorPreviewFragment.this.getContext(), PictureSelectorPreviewFragment.this.getString(R$string.ps_save_success) + "\n" + str);
            }
        }

        public m(LocalMedia localMedia) {
            this.f34792a = localMedia;
        }

        @Override // na.b.a
        public void a() {
            String strF = this.f34792a.f();
            if (ma.d.g(strF)) {
                PictureSelectorPreviewFragment.this.I0();
            }
            ab.g.a(PictureSelectorPreviewFragment.this.getContext(), strF, this.f34792a.s(), new a());
        }
    }

    public class n extends ViewPager2.OnPageChangeCallback {
        public n() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            if (PictureSelectorPreviewFragment.this.f34758n.size() > i10) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                int i12 = pictureSelectorPreviewFragment.D / 2;
                ArrayList<LocalMedia> arrayList = pictureSelectorPreviewFragment.f34758n;
                if (i11 >= i12) {
                    i10++;
                }
                LocalMedia localMedia = arrayList.get(i10);
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment2.G.setSelected(pictureSelectorPreviewFragment2.N1(localMedia));
                PictureSelectorPreviewFragment.this.Q1(localMedia);
                PictureSelectorPreviewFragment.this.S1(localMedia);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f34765u = i10;
            pictureSelectorPreviewFragment.f34763s.setTitle((PictureSelectorPreviewFragment.this.f34765u + 1) + "/" + PictureSelectorPreviewFragment.this.C);
            if (PictureSelectorPreviewFragment.this.f34758n.size() > i10) {
                LocalMedia localMedia = PictureSelectorPreviewFragment.this.f34758n.get(i10);
                PictureSelectorPreviewFragment.this.S1(localMedia);
                if (PictureSelectorPreviewFragment.this.M1()) {
                    PictureSelectorPreviewFragment.this.v1(i10);
                }
                if (PictureSelectorPreviewFragment.this.f34945f.M) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment2.f34766v && pictureSelectorPreviewFragment2.f34945f.C0) {
                        PictureSelectorPreviewFragment.this.k2(i10);
                    } else {
                        PictureSelectorPreviewFragment.this.f34761q.m(i10);
                    }
                } else if (PictureSelectorPreviewFragment.this.f34945f.C0) {
                    PictureSelectorPreviewFragment.this.k2(i10);
                }
                PictureSelectorPreviewFragment.this.Q1(localMedia);
                PictureSelectorPreviewFragment.this.f34762r.i(ma.d.i(localMedia.s()) || ma.d.d(localMedia.s()));
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment3.f34770z || pictureSelectorPreviewFragment3.f34766v || pictureSelectorPreviewFragment3.f34945f.f35028p0 || !PictureSelectorPreviewFragment.this.f34945f.f35008f0) {
                    return;
                }
                if (PictureSelectorPreviewFragment.this.f34764t) {
                    if (i10 == (r0.f34761q.getItemCount() - 1) - 10 || i10 == PictureSelectorPreviewFragment.this.f34761q.getItemCount() - 1) {
                        PictureSelectorPreviewFragment.this.O1();
                    }
                }
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34796b;

        public o(int i10) {
            this.f34796b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment.this.f34761q.n(this.f34796b);
        }
    }

    public class p implements ra.d<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34798a;

        public p(int i10) {
            this.f34798a = i10;
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.h2(iArr[0], iArr[1], this.f34798a);
        }
    }

    public class q implements ra.d<int[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34800a;

        public q(int i10) {
            this.f34800a = i10;
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.h2(iArr[0], iArr[1], this.f34800a);
        }
    }

    public class r implements ra.d<pa.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ra.d f34803b;

        public r(LocalMedia localMedia, ra.d dVar) {
            this.f34802a = localMedia;
            this.f34803b = dVar;
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(pa.b bVar) {
            if (bVar.c() > 0) {
                this.f34802a.w0(bVar.c());
            }
            if (bVar.b() > 0) {
                this.f34802a.h0(bVar.b());
            }
            ra.d dVar = this.f34803b;
            if (dVar != null) {
                dVar.a(new int[]{this.f34802a.D(), this.f34802a.q()});
            }
        }
    }

    public class s implements ra.d<pa.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ra.d f34806b;

        public s(LocalMedia localMedia, ra.d dVar) {
            this.f34805a = localMedia;
            this.f34806b = dVar;
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(pa.b bVar) {
            if (bVar.c() > 0) {
                this.f34805a.w0(bVar.c());
            }
            if (bVar.b() > 0) {
                this.f34805a.h0(bVar.b());
            }
            ra.d dVar = this.f34806b;
            if (dVar != null) {
                dVar.a(new int[]{this.f34805a.D(), this.f34805a.q()});
            }
        }
    }

    public class t implements ra.d<int[]> {
        public t() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.w1(iArr);
        }
    }

    public class u implements ra.d<int[]> {
        public u() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr) {
            PictureSelectorPreviewFragment.this.w1(iArr);
        }
    }

    public class v extends ra.u<LocalMedia> {
        public v() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorPreviewFragment.this.E1(arrayList, z10);
        }
    }

    public class w extends ra.u<LocalMedia> {
        public w() {
        }

        @Override // ra.u
        public void a(ArrayList<LocalMedia> arrayList, boolean z10) {
            PictureSelectorPreviewFragment.this.E1(arrayList, z10);
        }
    }

    public class x implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectMainStyle f34812b;

        public x(SelectMainStyle selectMainStyle) {
            this.f34812b = selectMainStyle;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.luck.picture.lib.style.SelectMainStyle r5 = r4.f34812b
                boolean r5 = r5.T()
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L29
                int r5 = va.a.l()
                if (r5 != 0) goto L29
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r2 = r5.f34758n
                androidx.viewpager2.widget.ViewPager2 r3 = r5.f34760p
                int r3 = r3.getCurrentItem()
                java.lang.Object r2 = r2.get(r3)
                com.luck.picture.lib.entity.LocalMedia r2 = (com.luck.picture.lib.entity.LocalMedia) r2
                int r5 = r5.u(r2, r1)
                if (r5 != 0) goto L27
                goto L2f
            L27:
                r0 = r1
                goto L2f
            L29:
                int r5 = va.a.l()
                if (r5 <= 0) goto L27
            L2f:
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                com.luck.picture.lib.config.PictureSelectionConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.Z0(r5)
                boolean r5 = r5.O
                if (r5 == 0) goto L45
                int r5 = va.a.l()
                if (r5 != 0) goto L45
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                r5.f0()
                goto L4c
            L45:
                if (r0 == 0) goto L4c
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                com.luck.picture.lib.PictureSelectorPreviewFragment.k1(r5)
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.x.onClick(android.view.View):void");
        }
    }

    public class y extends TitleBar.a {
        public y() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.a
        public void a() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f34770z) {
                if (pictureSelectorPreviewFragment.f34945f.M) {
                    PictureSelectorPreviewFragment.this.f34759o.t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.D1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f34766v || !pictureSelectorPreviewFragment.f34945f.M) {
                PictureSelectorPreviewFragment.this.X();
            } else {
                PictureSelectorPreviewFragment.this.f34759o.t();
            }
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.y1();
        }
    }

    public static PictureSelectorPreviewFragment P1() {
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new Bundle());
        return pictureSelectorPreviewFragment;
    }

    public String A1() {
        return Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(com.luck.picture.lib.entity.LocalMedia r7, boolean r8, ra.d<int[]> r9) {
        /*
            r6 = this;
            int r0 = r7.D()
            int r1 = r7.q()
            boolean r0 = ab.j.n(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r8 = r6.D
            int r0 = r6.E
            goto L47
        L15:
            int r0 = r7.D()
            int r3 = r7.q()
            if (r8 == 0) goto L45
            if (r0 <= 0) goto L25
            if (r3 <= 0) goto L25
            if (r0 <= r3) goto L45
        L25:
            com.luck.picture.lib.config.PictureSelectionConfig r8 = r6.f34945f
            boolean r8 = r8.H0
            if (r8 == 0) goto L45
            androidx.viewpager2.widget.ViewPager2 r8 = r6.f34760p
            r4 = 0
            r8.setAlpha(r4)
            android.content.Context r8 = r6.getContext()
            java.lang.String r4 = r7.f()
            com.luck.picture.lib.PictureSelectorPreviewFragment$r r5 = new com.luck.picture.lib.PictureSelectorPreviewFragment$r
            r5.<init>(r7, r9)
            ab.j.g(r8, r4, r5)
            r8 = r0
            r0 = r3
            r3 = r1
            goto L48
        L45:
            r8 = r0
            r0 = r3
        L47:
            r3 = r2
        L48:
            boolean r4 = r7.G()
            if (r4 == 0) goto L62
            int r4 = r7.k()
            if (r4 <= 0) goto L62
            int r4 = r7.j()
            if (r4 <= 0) goto L62
            int r8 = r7.k()
            int r0 = r7.j()
        L62:
            if (r3 == 0) goto L6e
            r7 = 2
            int[] r7 = new int[r7]
            r7[r1] = r8
            r7[r2] = r0
            r9.a(r7)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.B1(com.luck.picture.lib.entity.LocalMedia, boolean, ra.d):void");
    }

    public final void C1(LocalMedia localMedia, boolean z10, ra.d<int[]> dVar) {
        boolean z11;
        if (!z10 || ((localMedia.D() > 0 && localMedia.q() > 0 && localMedia.D() <= localMedia.q()) || !this.f34945f.H0)) {
            z11 = true;
        } else {
            this.f34760p.setAlpha(0.0f);
            ab.j.m(getContext(), localMedia.f(), new s(localMedia, dVar));
            z11 = false;
        }
        if (z11) {
            dVar.a(new int[]{localMedia.D(), localMedia.q()});
        }
    }

    public final void D1() {
        if (ab.a.c(getActivity())) {
            return;
        }
        if (this.f34945f.L) {
            F1();
        }
        f0();
    }

    public final void E1(List<LocalMedia> list, boolean z10) {
        if (ab.a.c(getActivity())) {
            return;
        }
        this.f34764t = z10;
        if (z10) {
            if (list.size() <= 0) {
                O1();
                return;
            }
            int size = this.f34758n.size();
            this.f34758n.addAll(list);
            this.f34761q.notifyItemRangeChanged(size, this.f34758n.size());
        }
    }

    public final void F1() {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            this.O.get(i10).setEnabled(true);
        }
        this.f34762r.getEditor().setEnabled(true);
    }

    public final void G1() {
        if (!M1()) {
            this.f34759o.setBackgroundAlpha(1.0f);
            return;
        }
        float f10 = this.f34767w ? 1.0f : 0.0f;
        this.f34759o.setBackgroundAlpha(f10);
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            if (!(this.O.get(i10) instanceof TitleBar)) {
                this.O.get(i10).setAlpha(f10);
            }
        }
    }

    public final void H1() {
        this.f34762r.f();
        this.f34762r.h();
        this.f34762r.setOnBottomNavBarListener(new f());
    }

    public final void I1() {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (ab.q.c(selectMainStyleC.D())) {
            this.G.setBackgroundResource(selectMainStyleC.D());
        } else if (ab.q.c(selectMainStyleC.I())) {
            this.G.setBackgroundResource(selectMainStyleC.I());
        }
        if (ab.q.f(selectMainStyleC.F())) {
            this.H.setText(selectMainStyleC.F());
        } else {
            this.H.setText("");
        }
        if (ab.q.b(selectMainStyleC.H())) {
            this.H.setTextSize(selectMainStyleC.H());
        }
        if (ab.q.c(selectMainStyleC.G())) {
            this.H.setTextColor(selectMainStyleC.G());
        }
        if (ab.q.b(selectMainStyleC.E())) {
            if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.G.getLayoutParams())).rightMargin = selectMainStyleC.E();
                }
            } else if (this.G.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).rightMargin = selectMainStyleC.E();
            }
        }
        this.J.c();
        this.J.setSelectedChange(true);
        if (selectMainStyleC.T()) {
            if (this.J.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.J.getLayoutParams();
                int i10 = R$id.title_bar;
                layoutParams.topToTop = i10;
                ((ConstraintLayout.LayoutParams) this.J.getLayoutParams()).bottomToBottom = i10;
                if (this.f34945f.L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.J.getLayoutParams())).topMargin = ab.e.i(getContext());
                }
            } else if ((this.J.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f34945f.L) {
                ((RelativeLayout.LayoutParams) this.J.getLayoutParams()).topMargin = ab.e.i(getContext());
            }
        }
        if (selectMainStyleC.X()) {
            if (this.G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.G.getLayoutParams();
                int i11 = R$id.bottom_nar_bar;
                layoutParams2.topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.G.getLayoutParams()).bottomToBottom = i11;
                ((ConstraintLayout.LayoutParams) this.H.getLayoutParams()).topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.H.getLayoutParams()).bottomToBottom = i11;
                ((ConstraintLayout.LayoutParams) this.I.getLayoutParams()).topToTop = i11;
                ((ConstraintLayout.LayoutParams) this.I.getLayoutParams()).bottomToBottom = i11;
            }
        } else if (this.f34945f.L) {
            if (this.H.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.H.getLayoutParams())).topMargin = ab.e.i(getContext());
            } else if (this.H.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.H.getLayoutParams()).topMargin = ab.e.i(getContext());
            }
        }
        this.J.setOnClickListener(new x(selectMainStyleC));
    }

    public void J1(ViewGroup viewGroup) {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (selectMainStyleC.V()) {
            this.M = new RecyclerView(getContext());
            if (ab.q.c(selectMainStyleC.p())) {
                this.M.setBackgroundResource(selectMainStyleC.p());
            } else {
                this.M.setBackgroundResource(R$drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.M);
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.bottomToTop = R$id.bottom_nar_bar;
                layoutParams2.startToStart = 0;
                layoutParams2.endToEnd = 0;
            }
            b bVar = new b(getContext());
            RecyclerView.ItemAnimator itemAnimator = this.M.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
            if (this.M.getItemDecorationCount() == 0) {
                this.M.addItemDecoration(new HorizontalItemDecoration(Integer.MAX_VALUE, ab.e.a(getContext(), 6.0f)));
            }
            bVar.setOrientation(0);
            this.M.setLayoutManager(bVar);
            if (va.a.l() > 0) {
                this.M.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R$anim.ps_anim_layout_fall_enter));
            }
            this.N = new PreviewGalleryAdapter(this.f34766v, va.a.n());
            Q1(this.f34758n.get(this.f34765u));
            this.M.setAdapter(this.N);
            this.N.m(new c());
            if (va.a.l() > 0) {
                this.M.setVisibility(0);
            } else {
                this.M.setVisibility(4);
            }
            u1(this.M);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new d());
            itemTouchHelper.attachToRecyclerView(this.M);
            this.N.n(new e(itemTouchHelper));
        }
    }

    public final void K1() {
        if (PictureSelectionConfig.T0.d().u()) {
            this.f34763s.setVisibility(8);
        }
        this.f34763s.d();
        this.f34763s.setOnTitleBarListener(new y());
        this.f34763s.setTitle((this.f34765u + 1) + "/" + this.C);
        this.f34763s.getImageDelete().setOnClickListener(new z());
        this.I.setOnClickListener(new a0());
        this.G.setOnClickListener(new a());
    }

    public final void L1(ArrayList<LocalMedia> arrayList) {
        PicturePreviewAdapter picturePreviewAdapterX1 = x1();
        this.f34761q = picturePreviewAdapterX1;
        picturePreviewAdapterX1.k(arrayList);
        this.f34761q.l(new b0(this, null));
        this.f34760p.setOrientation(0);
        this.f34760p.setAdapter(this.f34761q);
        va.a.g();
        if (arrayList.size() == 0 || this.f34765u > arrayList.size()) {
            j0();
            return;
        }
        LocalMedia localMedia = arrayList.get(this.f34765u);
        this.f34762r.i(ma.d.i(localMedia.s()) || ma.d.d(localMedia.s()));
        this.G.setSelected(va.a.n().contains(arrayList.get(this.f34760p.getCurrentItem())));
        this.f34760p.registerOnPageChangeCallback(this.P);
        this.f34760p.setPageTransformer(new MarginPageTransformer(ab.e.a(getContext(), 3.0f)));
        this.f34760p.setCurrentItem(this.f34765u, false);
        z0(false);
        S1(arrayList.get(this.f34765u));
        l2(localMedia);
    }

    public final boolean M1() {
        return !this.f34766v && this.f34945f.M;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        int iA = ma.b.a(getContext(), 2);
        return iA != 0 ? iA : R$layout.ps_fragment_preview;
    }

    public boolean N1(LocalMedia localMedia) {
        return va.a.n().contains(localMedia);
    }

    public final void O1() {
        int i10 = this.f34943d + 1;
        this.f34943d = i10;
        oa.e eVar = PictureSelectionConfig.R0;
        if (eVar == null) {
            this.f34944e.h(this.F, i10, this.f34945f.f35006e0, new w());
            return;
        }
        Context context = getContext();
        long j10 = this.F;
        int i11 = this.f34943d;
        int i12 = this.f34945f.f35006e0;
        eVar.c(context, j10, i11, i12, i12, new v());
    }

    public final void Q1(LocalMedia localMedia) {
        if (this.N == null || !PictureSelectionConfig.T0.c().V()) {
            return;
        }
        this.N.i(localMedia);
    }

    public final void R1(boolean z10, LocalMedia localMedia) {
        if (this.N == null || !PictureSelectionConfig.T0.c().V()) {
            return;
        }
        if (this.M.getVisibility() == 4) {
            this.M.setVisibility(0);
        }
        if (z10) {
            if (this.f34945f.f35017k == 1) {
                this.N.clear();
            }
            this.N.e(localMedia);
            this.M.smoothScrollToPosition(this.N.getItemCount() - 1);
            return;
        }
        this.N.l(localMedia);
        if (va.a.l() == 0) {
            this.M.setVisibility(4);
        }
    }

    public void S1(LocalMedia localMedia) {
        if (PictureSelectionConfig.T0.c().W() && PictureSelectionConfig.T0.c().Y()) {
            this.G.setText("");
            for (int i10 = 0; i10 < va.a.l(); i10++) {
                LocalMedia localMedia2 = va.a.n().get(i10);
                if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                    localMedia.l0(localMedia2.t());
                    localMedia2.q0(localMedia.x());
                    this.G.setText(ab.s.g(Integer.valueOf(localMedia.t())));
                }
            }
        }
    }

    public void T1() {
        if (this.f34770z) {
            return;
        }
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

    public final void U1(LocalMedia localMedia) {
        ra.g gVar = PictureSelectionConfig.X0;
        if (gVar == null || gVar.a(localMedia)) {
            return;
        }
        na.b.c(getContext(), getString(R$string.ps_prompt), (ma.d.d(localMedia.s()) || ma.d.l(localMedia.f())) ? getString(R$string.ps_prompt_audio_content) : (ma.d.i(localMedia.s()) || ma.d.o(localMedia.f())) ? getString(R$string.ps_prompt_video_content) : getString(R$string.ps_prompt_image_content)).b(new m(localMedia));
    }

    public final void V1() {
        if (ab.a.c(getActivity())) {
            return;
        }
        if (this.f34770z) {
            if (this.f34945f.M) {
                this.f34759o.t();
                return;
            } else {
                f0();
                return;
            }
        }
        if (this.f34766v) {
            X();
        } else if (this.f34945f.M) {
            this.f34759o.t();
        } else {
            X();
        }
    }

    public void W1(float f10) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            if (!(this.O.get(i10) instanceof TitleBar)) {
                this.O.get(i10).setAlpha(f10);
            }
        }
    }

    public void X1(MagicalView magicalView, boolean z10) {
        int iD;
        int iQ;
        BasePreviewHolder basePreviewHolderC = this.f34761q.c(this.f34760p.getCurrentItem());
        if (basePreviewHolderC == null) {
            return;
        }
        LocalMedia localMedia = this.f34758n.get(this.f34760p.getCurrentItem());
        if (!localMedia.G() || localMedia.k() <= 0 || localMedia.j() <= 0) {
            iD = localMedia.D();
            iQ = localMedia.q();
        } else {
            iD = localMedia.k();
            iQ = localMedia.j();
        }
        if (ab.j.n(iD, iQ)) {
            basePreviewHolderC.f34858q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            basePreviewHolderC.f34858q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderC;
            if (this.f34945f.C0) {
                k2(this.f34760p.getCurrentItem());
            } else {
                if (previewVideoHolder.f34922s.getVisibility() != 8 || this.f34761q.e(this.f34760p.getCurrentItem())) {
                    return;
                }
                previewVideoHolder.f34922s.setVisibility(0);
            }
        }
    }

    public void Y1() {
        BasePreviewHolder basePreviewHolderC = this.f34761q.c(this.f34760p.getCurrentItem());
        if (basePreviewHolderC == null) {
            return;
        }
        if (basePreviewHolderC.f34858q.getVisibility() == 8) {
            basePreviewHolderC.f34858q.setVisibility(0);
        }
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderC;
            if (previewVideoHolder.f34922s.getVisibility() == 0) {
                previewVideoHolder.f34922s.setVisibility(8);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void Z() {
        this.f34762r.g();
    }

    public void Z1(boolean z10) {
        BasePreviewHolder basePreviewHolderC;
        ViewParams viewParamsD = ua.a.d(this.f34769y ? this.f34765u + 1 : this.f34765u);
        if (viewParamsD == null || (basePreviewHolderC = this.f34761q.c(this.f34760p.getCurrentItem())) == null) {
            return;
        }
        basePreviewHolderC.f34858q.getLayoutParams().width = viewParamsD.f35125d;
        basePreviewHolderC.f34858q.getLayoutParams().height = viewParamsD.f35126e;
        basePreviewHolderC.f34858q.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public void a2() {
        if (this.f34770z && U() && M1()) {
            f0();
        } else {
            X();
        }
    }

    public final void b2() {
        if (this.B) {
            return;
        }
        boolean z10 = this.f34763s.getTranslationY() == 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        float f10 = z10 ? 0.0f : -this.f34763s.getHeight();
        float f11 = z10 ? -this.f34763s.getHeight() : 0.0f;
        float f12 = z10 ? 1.0f : 0.0f;
        float f13 = z10 ? 0.0f : 1.0f;
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            View view = this.O.get(i10);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", f12, f13));
            if (view instanceof TitleBar) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", f10, f11));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.B = true;
        animatorSet.addListener(new l());
        if (z10) {
            i2();
        } else {
            F1();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void c0(Intent intent) {
        if (this.f34758n.size() > this.f34760p.getCurrentItem()) {
            LocalMedia localMedia = this.f34758n.get(this.f34760p.getCurrentItem());
            Uri uriB = ma.a.b(intent);
            localMedia.b0(uriB != null ? uriB.getPath() : "");
            localMedia.V(ma.a.h(intent));
            localMedia.U(ma.a.e(intent));
            localMedia.W(ma.a.f(intent));
            localMedia.X(ma.a.g(intent));
            localMedia.Y(ma.a.c(intent));
            localMedia.a0(!TextUtils.isEmpty(localMedia.m()));
            localMedia.Z(ma.a.d(intent));
            localMedia.e0(localMedia.G());
            localMedia.s0(localMedia.m());
            if (va.a.n().contains(localMedia)) {
                LocalMedia localMediaH = localMedia.h();
                if (localMediaH != null) {
                    localMediaH.b0(localMedia.m());
                    localMediaH.a0(localMedia.G());
                    localMediaH.e0(localMedia.H());
                    localMediaH.Z(localMedia.l());
                    localMediaH.s0(localMedia.m());
                    localMediaH.V(ma.a.h(intent));
                    localMediaH.U(ma.a.e(intent));
                    localMediaH.W(ma.a.f(intent));
                    localMediaH.X(ma.a.g(intent));
                    localMediaH.Y(ma.a.c(intent));
                }
                A0(localMedia);
            } else {
                u(localMedia, false);
            }
            this.f34761q.notifyItemChanged(this.f34760p.getCurrentItem());
            Q1(localMedia);
        }
    }

    public void c2(Bundle bundle) {
        if (bundle != null) {
            this.f34943d = bundle.getInt("com.luck.picture.lib.current_page", 1);
            this.F = bundle.getLong("com.luck.picture.lib.current_bucketId", -1L);
            this.f34765u = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f34765u);
            this.f34769y = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f34769y);
            this.C = bundle.getInt("com.luck.picture.lib.current_album_total", this.C);
            this.f34770z = bundle.getBoolean("com.luck.picture.lib.external_preview", this.f34770z);
            this.A = bundle.getBoolean("com.luck.picture.lib.external_preview_display_delete", this.A);
            this.f34766v = bundle.getBoolean("com.luck.picture.lib.bottom_preview", this.f34766v);
            this.f34768x = bundle.getString("com.luck.picture.lib.current_album_name", "");
            if (this.f34758n.size() == 0) {
                this.f34758n.addAll(new ArrayList(va.a.m()));
            }
        }
    }

    public void d2(int i10, int i11, ArrayList<LocalMedia> arrayList, boolean z10) {
        this.f34758n = arrayList;
        this.C = i11;
        this.f34765u = i10;
        this.A = z10;
        this.f34770z = true;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void e0() {
        if (this.f34945f.L) {
            F1();
        }
    }

    public void e2(boolean z10, String str, boolean z11, int i10, int i11, int i12, long j10, ArrayList<LocalMedia> arrayList) {
        this.f34943d = i12;
        this.F = j10;
        this.f34758n = arrayList;
        this.C = i11;
        this.f34765u = i10;
        this.f34768x = str;
        this.f34769y = z11;
        this.f34766v = z10;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void f0() {
        PicturePreviewAdapter picturePreviewAdapter = this.f34761q;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        super.f0();
    }

    public void f2() {
        if (M1()) {
            this.f34759o.setOnMojitoViewCallback(new k());
        }
    }

    public final void g2() {
        ArrayList<LocalMedia> arrayList;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        if (ab.q.c(selectMainStyleC.C())) {
            this.f34759o.setBackgroundColor(selectMainStyleC.C());
            return;
        }
        if (this.f34945f.f34999b == ma.e.b() || ((arrayList = this.f34758n) != null && arrayList.size() > 0 && ma.d.d(this.f34758n.get(0).s()))) {
            this.f34759o.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_white));
        } else {
            this.f34759o.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
    }

    public final void h2(int i10, int i11, int i12) {
        this.f34759o.A(i10, i11, true);
        if (this.f34769y) {
            i12++;
        }
        ViewParams viewParamsD = ua.a.d(i12);
        if (viewParamsD == null || i10 == 0 || i11 == 0) {
            this.f34759o.F(0, 0, 0, 0, i10, i11);
        } else {
            this.f34759o.F(viewParamsD.f35123b, viewParamsD.f35124c, viewParamsD.f35125d, viewParamsD.f35126e, i10, i11);
        }
    }

    public final void i2() {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            this.O.get(i10).setEnabled(false);
        }
        this.f34762r.getEditor().setEnabled(false);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void j0() {
        V1();
    }

    public final void j2(int[] iArr) {
        int i10;
        this.f34759o.A(iArr[0], iArr[1], false);
        ViewParams viewParamsD = ua.a.d(this.f34769y ? this.f34765u + 1 : this.f34765u);
        if (viewParamsD == null || ((i10 = iArr[0]) == 0 && iArr[1] == 0)) {
            this.f34760p.post(new j(iArr));
            this.f34759o.setBackgroundAlpha(1.0f);
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                this.O.get(i11).setAlpha(1.0f);
            }
        } else {
            this.f34759o.F(viewParamsD.f35123b, viewParamsD.f35124c, viewParamsD.f35125d, viewParamsD.f35126e, i10, iArr[1]);
            this.f34759o.J(false);
        }
        ObjectAnimator.ofFloat(this.f34760p, "alpha", 0.0f, 1.0f).setDuration(50L).start();
    }

    public final void k2(int i10) {
        this.f34760p.post(new o(i10));
    }

    public void l2(LocalMedia localMedia) {
        if (this.f34767w || this.f34766v || !this.f34945f.M) {
            return;
        }
        this.f34760p.post(new g());
        if (ma.d.i(localMedia.s())) {
            C1(localMedia, !ma.d.g(localMedia.f()), new h());
        } else {
            B1(localMedia, !ma.d.g(localMedia.f()), new i());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (M1()) {
            int size = this.f34758n.size();
            int i10 = this.f34765u;
            if (size > i10) {
                LocalMedia localMedia = this.f34758n.get(i10);
                if (ma.d.i(localMedia.s())) {
                    C1(localMedia, false, new t());
                } else {
                    B1(localMedia, false, new u());
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        if (M1()) {
            return null;
        }
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.T0.e();
        if (pictureWindowAnimationStyleE.f35156d == 0 || pictureWindowAnimationStyleE.f35157e == 0) {
            return super.onCreateAnimation(i10, z10, i11);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), z10 ? pictureWindowAnimationStyleE.f35156d : pictureWindowAnimationStyleE.f35157e);
        if (z10) {
            d0();
        } else {
            e0();
        }
        return animationLoadAnimation;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PicturePreviewAdapter picturePreviewAdapter = this.f34761q;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        ViewPager2 viewPager2 = this.f34760p;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.P);
        }
        super.onDestroy();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.current_page", this.f34943d);
        bundle.putLong("com.luck.picture.lib.current_bucketId", this.F);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f34765u);
        bundle.putInt("com.luck.picture.lib.current_album_total", this.C);
        bundle.putBoolean("com.luck.picture.lib.external_preview", this.f34770z);
        bundle.putBoolean("com.luck.picture.lib.external_preview_display_delete", this.A);
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f34769y);
        bundle.putBoolean("com.luck.picture.lib.bottom_preview", this.f34766v);
        bundle.putString("com.luck.picture.lib.current_album_name", this.f34768x);
        va.a.d(this.f34758n);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        c2(bundle);
        this.f34767w = bundle != null;
        this.D = ab.e.e(getContext());
        this.E = ab.e.g(getContext());
        this.f34763s = (PreviewTitleBar) view.findViewById(R$id.title_bar);
        this.G = (TextView) view.findViewById(R$id.ps_tv_selected);
        this.H = (TextView) view.findViewById(R$id.ps_tv_selected_word);
        this.I = view.findViewById(R$id.select_click_area);
        this.J = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f34759o = (MagicalView) view.findViewById(R$id.magical);
        this.f34760p = new ViewPager2(getContext());
        this.f34762r = (PreviewBottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f34759o.setMagicalContent(this.f34760p);
        g2();
        f2();
        u1(this.f34763s, this.G, this.H, this.I, this.J, this.f34762r);
        T1();
        K1();
        L1(this.f34758n);
        if (this.f34770z) {
            z1();
        } else {
            H1();
            J1((ViewGroup) view);
            I1();
        }
        G1();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void r0(boolean z10, LocalMedia localMedia) {
        this.G.setSelected(va.a.n().contains(localMedia));
        this.f34762r.h();
        this.J.setSelectedChange(true);
        S1(localMedia);
        R1(z10, localMedia);
    }

    public void u1(View... viewArr) {
        Collections.addAll(this.O, viewArr);
    }

    public final void v1(int i10) {
        LocalMedia localMedia = this.f34758n.get(i10);
        if (ma.d.i(localMedia.s())) {
            C1(localMedia, false, new p(i10));
        } else {
            B1(localMedia, false, new q(i10));
        }
    }

    public final void w1(int[] iArr) {
        int i10;
        int i11;
        ViewParams viewParamsD = ua.a.d(this.f34769y ? this.f34765u + 1 : this.f34765u);
        if (viewParamsD == null || (i10 = iArr[0]) == 0 || (i11 = iArr[1]) == 0) {
            this.f34759o.F(0, 0, 0, 0, iArr[0], iArr[1]);
            this.f34759o.C(iArr[0], iArr[1], false);
        } else {
            this.f34759o.F(viewParamsD.f35123b, viewParamsD.f35124c, viewParamsD.f35125d, viewParamsD.f35126e, i10, i11);
            this.f34759o.B();
        }
    }

    public PicturePreviewAdapter x1() {
        return new PicturePreviewAdapter();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void y1() {
        ra.g gVar;
        if (!this.A || (gVar = PictureSelectionConfig.X0) == null) {
            return;
        }
        gVar.b(this.f34760p.getCurrentItem());
        int currentItem = this.f34760p.getCurrentItem();
        this.f34758n.remove(currentItem);
        if (this.f34758n.size() == 0) {
            D1();
            return;
        }
        this.f34763s.setTitle(getString(R$string.ps_preview_image_num, Integer.valueOf(this.f34765u + 1), Integer.valueOf(this.f34758n.size())));
        this.C = this.f34758n.size();
        this.f34765u = currentItem;
        if (this.f34760p.getAdapter() != null) {
            this.f34760p.setAdapter(null);
            this.f34760p.setAdapter(this.f34761q);
        }
        this.f34760p.setCurrentItem(this.f34765u, false);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void z0(boolean z10) {
        if (PictureSelectionConfig.T0.c().W() && PictureSelectionConfig.T0.c().Y()) {
            int i10 = 0;
            while (i10 < va.a.l()) {
                LocalMedia localMedia = va.a.n().get(i10);
                i10++;
                localMedia.l0(i10);
            }
        }
    }

    public final void z1() {
        this.f34763s.getImageDelete().setVisibility(this.A ? 0 : 8);
        this.G.setVisibility(8);
        this.f34762r.setVisibility(8);
        this.J.setVisibility(8);
    }
}
