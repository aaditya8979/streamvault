package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import wf.j;

/* JADX INFO: loaded from: classes10.dex */
public class UCropFragment extends Fragment {
    public static final Bitmap.CompressFormat A = Bitmap.CompressFormat.JPEG;
    public static final String B = UCropFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.yalantis.ucrop.b f53748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColorInt
    public int f53751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f53753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Transition f53754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UCropView f53755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureCropImageView f53756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OverlayView f53757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f53758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ViewGroup f53759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f53760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f53761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f53762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup f53763q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f53765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f53766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f53767u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<ViewGroup> f53764r = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bitmap.CompressFormat f53768v = A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f53769w = 90;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f53770x = {1, 2, 3};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TransformImageView.c f53771y = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View.OnClickListener f53772z = new g();

    public class a implements TransformImageView.c {
        public a() {
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void a() {
            UCropFragment.this.f53755i.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.f53767u.setClickable(false);
            UCropFragment.this.f53748b.loadingProgress(false);
            if (UCropFragment.this.getArguments().getBoolean("com.yalantis.ucrop.ForbidCropGifWebp", false)) {
                String strF = j.f(UCropFragment.this.getContext(), (Uri) UCropFragment.this.getArguments().getParcelable("com.yalantis.ucrop.InputUri"));
                if (j.m(strF) || j.t(strF)) {
                    UCropFragment.this.f53767u.setClickable(true);
                }
            }
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void b(@NonNull Exception exc) {
            UCropFragment.this.f53748b.onCropFinish(UCropFragment.this.q(exc));
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void c(float f10) {
            UCropFragment.this.C(f10);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void d(float f10) {
            UCropFragment.this.y(f10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropFragment.this.f53756j.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).b(view.isSelected()));
            UCropFragment.this.f53756j.y();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropFragment.this.f53764r) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropFragment.this.f53756j.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropFragment.this.f53756j.s();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            UCropFragment.this.f53756j.w(f10 / 42.0f);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropFragment.this.v();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropFragment.this.w(90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropFragment.this.f53756j.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropFragment.this.f53756j.s();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropFragment.this.f53756j.B(UCropFragment.this.f53756j.getCurrentScale() + (f10 * ((UCropFragment.this.f53756j.getMaxScale() - UCropFragment.this.f53756j.getMinScale()) / 15000.0f)));
            } else {
                UCropFragment.this.f53756j.D(UCropFragment.this.f53756j.getCurrentScale() + (f10 * ((UCropFragment.this.f53756j.getMaxScale() - UCropFragment.this.f53756j.getMinScale()) / 15000.0f)));
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropFragment.this.E(view.getId());
        }
    }

    public class h implements sf.a {
        public h() {
        }

        @Override // sf.a
        public void a(@NonNull Uri uri, int i10, int i11, int i12, int i13) {
            com.yalantis.ucrop.b bVar = UCropFragment.this.f53748b;
            UCropFragment uCropFragment = UCropFragment.this;
            bVar.onCropFinish(uCropFragment.r(uri, uCropFragment.f53756j.getTargetAspectRatio(), i10, i11, i12, i13));
            UCropFragment.this.f53748b.loadingProgress(false);
        }

        @Override // sf.a
        public void b(@NonNull Throwable th2) {
            UCropFragment.this.f53748b.onCropFinish(UCropFragment.this.q(th2));
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f53782b;

        public i(int i10, Intent intent) {
            this.f53781a = i10;
            this.f53782b = intent;
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static UCropFragment t(Bundle bundle) {
        UCropFragment uCropFragment = new UCropFragment();
        uCropFragment.setArguments(bundle);
        return uCropFragment;
    }

    public final void A(@NonNull Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) bundle.getParcelable("com.yalantis.ucrop.OutputUri");
        u(bundle);
        if (uri == null || uri2 == null) {
            this.f53748b.onCropFinish(q(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.f53756j.k(uri, j.u(getContext(), bundle.getBoolean("com.yalantis.ucrop.ForbidCropGifWebp", false), uri, uri2), this.f53749c);
        } catch (Exception e10) {
            this.f53748b.onCropFinish(q(e10));
        }
    }

    public final void B() {
        if (!this.f53753g) {
            x(0);
        } else if (this.f53758l.getVisibility() == 0) {
            E(R$id.state_aspect_ratio);
        } else {
            E(R$id.state_scale);
        }
    }

    public final void C(float f10) {
        TextView textView = this.f53766t;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    public final void D(int i10) {
        TextView textView = this.f53766t;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void E(@IdRes int i10) {
        if (this.f53753g) {
            ViewGroup viewGroup = this.f53758l;
            int i11 = R$id.state_aspect_ratio;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.f53759m;
            int i12 = R$id.state_rotate;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.f53760n;
            int i13 = R$id.state_scale;
            viewGroup3.setSelected(i10 == i13);
            this.f53761o.setVisibility(i10 == i11 ? 0 : 8);
            this.f53762p.setVisibility(i10 == i12 ? 0 : 8);
            this.f53763q.setVisibility(i10 == i13 ? 0 : 8);
            n(i10);
            if (i10 == i13) {
                x(0);
            } else if (i10 == i12) {
                x(1);
            } else {
                x(2);
            }
        }
    }

    public final void F(@NonNull Bundle bundle, View view) {
        int i10 = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList<AspectRatio> parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            i10 = 2;
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayList) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f53750d);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.f53764r.add(frameLayout);
        }
        this.f53764r.get(i10).setSelected(true);
        Iterator<ViewGroup> it = this.f53764r.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new b());
        }
    }

    public final void G(View view) {
        this.f53765s = (TextView) view.findViewById(R$id.text_view_rotate);
        int i10 = R$id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i10)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) view.findViewById(i10)).setMiddleLineColor(this.f53750d);
        view.findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new d());
        view.findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new e());
        z(this.f53750d);
    }

    public final void H(View view) {
        this.f53766t = (TextView) view.findViewById(R$id.text_view_scale);
        int i10 = R$id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i10)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) view.findViewById(i10)).setMiddleLineColor(this.f53750d);
        D(this.f53750d);
    }

    public final void I(View view) {
        ImageView imageView = (ImageView) view.findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new wf.i(imageView.getDrawable(), this.f53750d));
        imageView2.setImageDrawable(new wf.i(imageView2.getDrawable(), this.f53750d));
        imageView3.setImageDrawable(new wf.i(imageView3.getDrawable(), this.f53750d));
    }

    public void J(View view, Bundle bundle) {
        this.f53750d = bundle.getInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor(getContext(), R$color.ucrop_color_active_controls_color));
        this.f53752f = bundle.getInt("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(getContext(), R$color.ucrop_color_default_logo));
        this.f53753g = !bundle.getBoolean("com.yalantis.ucrop.HideBottomControls", false);
        this.f53751e = bundle.getInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(getContext(), R$color.ucrop_color_crop_background));
        s(view);
        this.f53748b.loadingProgress(true);
        if (!this.f53753g) {
            int i10 = R$id.ucrop_frame;
            ((RelativeLayout.LayoutParams) view.findViewById(i10).getLayoutParams()).bottomMargin = 0;
            view.findViewById(i10).requestLayout();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R$id.controls_wrapper);
        viewGroup.setVisibility(0);
        LayoutInflater.from(getContext()).inflate(R$layout.ucrop_controls, viewGroup, true);
        AutoTransition autoTransition = new AutoTransition();
        this.f53754h = autoTransition;
        autoTransition.setDuration(50L);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R$id.state_aspect_ratio);
        this.f53758l = viewGroup2;
        viewGroup2.setOnClickListener(this.f53772z);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R$id.state_rotate);
        this.f53759m = viewGroup3;
        viewGroup3.setOnClickListener(this.f53772z);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R$id.state_scale);
        this.f53760n = viewGroup4;
        viewGroup4.setOnClickListener(this.f53772z);
        this.f53761o = (ViewGroup) view.findViewById(R$id.layout_aspect_ratio);
        this.f53762p = (ViewGroup) view.findViewById(R$id.layout_rotate_wheel);
        this.f53763q = (ViewGroup) view.findViewById(R$id.layout_scale_wheel);
        F(bundle, view);
        G(view);
        H(view);
        I(view);
    }

    public final void m(View view) {
        if (this.f53767u == null) {
            this.f53767u = new View(getContext());
            this.f53767u.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f53767u.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R$id.ucrop_photobox)).addView(this.f53767u);
    }

    public final void n(int i10) {
        if (getView() != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) getView().findViewById(R$id.ucrop_photobox), this.f53754h);
        }
        this.f53760n.findViewById(R$id.text_view_scale).setVisibility(i10 == R$id.state_scale ? 0 : 8);
        this.f53758l.findViewById(R$id.text_view_crop).setVisibility(i10 == R$id.state_aspect_ratio ? 0 : 8);
        this.f53759m.findViewById(R$id.text_view_rotate).setVisibility(i10 != R$id.state_rotate ? 8 : 0);
    }

    public void o() {
        this.f53767u.setClickable(true);
        this.f53748b.loadingProgress(true);
        this.f53756j.t(this.f53768v, this.f53769w, new h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof com.yalantis.ucrop.b) {
            this.f53748b = (com.yalantis.ucrop.b) getParentFragment();
        } else {
            if (context instanceof com.yalantis.ucrop.b) {
                this.f53748b = (com.yalantis.ucrop.b) context;
                return;
            }
            throw new IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R$layout.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        J(viewInflate, arguments);
        A(arguments);
        B();
        m(viewInflate);
        return viewInflate;
    }

    public void p() {
        A(getArguments());
        this.f53755i.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
        boolean z10 = false;
        this.f53748b.loadingProgress(false);
        if (getArguments().getBoolean("com.yalantis.ucrop.ForbidCropGifWebp", false)) {
            String strF = j.f(getContext(), (Uri) getArguments().getParcelable("com.yalantis.ucrop.InputUri"));
            if (j.m(strF) || j.t(strF)) {
                z10 = true;
            }
        }
        this.f53767u.setClickable(z10);
    }

    public i q(Throwable th2) {
        return new i(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    public i r(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        return new i(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11).putExtra("com.yalantis.ucrop.CropInputOriginal", j.e((Uri) getArguments().getParcelable("com.yalantis.ucrop.InputUri"))));
    }

    public final void s(View view) {
        UCropView uCropView = (UCropView) view.findViewById(R$id.ucrop);
        this.f53755i = uCropView;
        this.f53756j = uCropView.getCropImageView();
        this.f53757k = this.f53755i.getOverlayView();
        this.f53756j.setTransformImageListener(this.f53771y);
        ((ImageView) view.findViewById(R$id.image_view_logo)).setColorFilter(this.f53752f, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R$id.ucrop_frame).setBackgroundColor(this.f53751e);
    }

    public final void u(@NonNull Bundle bundle) {
        String string = bundle.getString("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = A;
        }
        this.f53768v = compressFormatValueOf;
        this.f53769w = bundle.getInt("com.yalantis.ucrop.CompressionQuality", 90);
        this.f53749c = bundle.getBoolean("com.yalantis.ucrop.CustomLoaderCropBitmap", false);
        int[] intArray = bundle.getIntArray("com.yalantis.ucrop.AllowedGestures");
        if (intArray != null && intArray.length == 3) {
            this.f53770x = intArray;
        }
        this.f53756j.setMaxBitmapSize(bundle.getInt("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f53756j.setMaxScaleMultiplier(bundle.getFloat("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f53756j.setImageToWrapCropBoundsAnimDuration(bundle.getInt("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f53757k.setFreestyleCropEnabled(bundle.getBoolean("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f53757k.setDragSmoothToCenter(bundle.getBoolean("com.yalantis.ucrop.DragSmoothToCenter", false));
        OverlayView overlayView = this.f53757k;
        Resources resources = getResources();
        int i10 = R$color.ucrop_color_default_dimmed;
        overlayView.setDimmedColor(bundle.getInt("com.yalantis.ucrop.DimmedLayerColor", resources.getColor(i10)));
        this.f53757k.setCircleStrokeColor(bundle.getInt("com.yalantis.ucrop.CircleStrokeColor", getResources().getColor(i10)));
        this.f53757k.setCircleDimmedLayer(bundle.getBoolean("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f53757k.setShowCropFrame(bundle.getBoolean("com.yalantis.ucrop.ShowCropFrame", true));
        this.f53757k.setCropFrameColor(bundle.getInt("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.f53757k.setCropFrameStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.f53757k.setShowCropGrid(bundle.getBoolean("com.yalantis.ucrop.ShowCropGrid", true));
        this.f53757k.setCropGridRowCount(bundle.getInt("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f53757k.setCropGridColumnCount(bundle.getInt("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f53757k.setCropGridColor(bundle.getInt("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        OverlayView overlayView2 = this.f53757k;
        Resources resources2 = getResources();
        int i11 = R$dimen.ucrop_default_crop_grid_stoke_width;
        overlayView2.setCropGridStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropGridStrokeWidth", resources2.getDimensionPixelSize(i11)));
        this.f53757k.setDimmedStrokeWidth(bundle.getInt("com.yalantis.ucrop.CircleStrokeWidth", getResources().getDimensionPixelSize(i11)));
        float f10 = bundle.getFloat("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float f11 = bundle.getFloat("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int i12 = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (f10 >= 0.0f && f11 >= 0.0f) {
            ViewGroup viewGroup = this.f53758l;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f12 = f10 / f11;
            this.f53756j.setTargetAspectRatio(Float.isNaN(f12) ? 0.0f : f12);
        } else if (parcelableArrayList == null || i12 >= parcelableArrayList.size()) {
            this.f53756j.setTargetAspectRatio(0.0f);
        } else {
            float fD = ((AspectRatio) parcelableArrayList.get(i12)).d() / ((AspectRatio) parcelableArrayList.get(i12)).e();
            this.f53756j.setTargetAspectRatio(Float.isNaN(fD) ? 0.0f : fD);
        }
        int i13 = bundle.getInt("com.yalantis.ucrop.MaxSizeX", 0);
        int i14 = bundle.getInt("com.yalantis.ucrop.MaxSizeY", 0);
        if (i13 <= 0 || i14 <= 0) {
            return;
        }
        this.f53756j.setMaxResultImageSizeX(i13);
        this.f53756j.setMaxResultImageSizeY(i14);
    }

    public final void v() {
        GestureCropImageView gestureCropImageView = this.f53756j;
        gestureCropImageView.w(-gestureCropImageView.getCurrentAngle());
        this.f53756j.y();
    }

    public final void w(int i10) {
        this.f53756j.w(i10);
        this.f53756j.y();
    }

    public final void x(int i10) {
        GestureCropImageView gestureCropImageView = this.f53756j;
        int i11 = this.f53770x[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.f53756j;
        int i12 = this.f53770x[i10];
        gestureCropImageView2.setRotateEnabled(i12 == 3 || i12 == 2);
        this.f53756j.setGestureEnabled(getArguments().getBoolean("com.yalantis.ucrop.isDragImages", true));
    }

    public final void y(float f10) {
        TextView textView = this.f53765s;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    public final void z(int i10) {
        TextView textView = this.f53765s;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }
}
