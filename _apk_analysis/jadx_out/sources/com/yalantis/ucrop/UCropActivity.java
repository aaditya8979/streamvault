package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
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
import wf.i;
import wf.j;

/* JADX INFO: loaded from: classes12.dex */
public class UCropActivity extends AppCompatActivity {
    public static final int ALL = 3;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    public static final int SCALE = 1;
    public boolean B;
    public UCropView C;
    public GestureCropImageView D;
    public OverlayView E;
    public ViewGroup F;
    public ViewGroup G;
    public ViewGroup H;
    public ViewGroup I;
    public ViewGroup J;
    public ViewGroup K;
    public TextView M;
    public TextView N;
    public View O;
    public Transition P;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f53728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f53729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f53732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f53734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @ColorInt
    public int f53735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @DrawableRes
    public int f53736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @DrawableRes
    public int f53737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f53738y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f53739z;
    public boolean A = true;
    public List<ViewGroup> L = new ArrayList();
    public Bitmap.CompressFormat Q = DEFAULT_COMPRESS_FORMAT;
    public int R = 90;
    public int[] S = {1, 2, 3};
    public TransformImageView.c T = new a();
    public final View.OnClickListener U = new g();

    public class a implements TransformImageView.c {
        public a() {
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void a() {
            UCropActivity.this.C.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.O.setClickable(false);
            if (UCropActivity.this.getIntent().getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false)) {
                String strF = j.f(UCropActivity.this, (Uri) UCropActivity.this.getIntent().getParcelableExtra("com.yalantis.ucrop.InputUri"));
                if (j.m(strF) || j.t(strF)) {
                    UCropActivity.this.O.setClickable(true);
                }
            }
            UCropActivity.this.A = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void b(@NonNull Exception exc) {
            UCropActivity.this.H(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void c(float f10) {
            UCropActivity.this.J(f10);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void d(float f10) {
            UCropActivity.this.D(f10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.D.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).b(view.isSelected()));
            UCropActivity.this.D.y();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.L) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.D.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.D.s();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            UCropActivity.this.D.w(f10 / 42.0f);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.A();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.B(90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.D.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.D.s();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.D.B(UCropActivity.this.D.getCurrentScale() + (f10 * ((UCropActivity.this.D.getMaxScale() - UCropActivity.this.D.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.D.D(UCropActivity.this.D.getCurrentScale() + (f10 * ((UCropActivity.this.D.getMaxScale() - UCropActivity.this.D.getMinScale()) / 15000.0f)));
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
            UCropActivity.this.M(view.getId());
        }
    }

    public class h implements sf.a {
        public h() {
        }

        @Override // sf.a
        public void a(@NonNull Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.I(uri, uCropActivity.D.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }

        @Override // sf.a
        public void b(@NonNull Throwable th2) {
            UCropActivity.this.H(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public final void A() {
        GestureCropImageView gestureCropImageView = this.D;
        gestureCropImageView.w(-gestureCropImageView.getCurrentAngle());
        this.D.y();
    }

    public final void B(int i10) {
        this.D.w(i10);
        this.D.y();
    }

    public final void C(int i10) {
        GestureCropImageView gestureCropImageView = this.D;
        int i11 = this.S[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.D;
        int i12 = this.S[i10];
        gestureCropImageView2.setRotateEnabled(i12 == 3 || i12 == 2);
        this.D.setGestureEnabled(getIntent().getBooleanExtra("com.yalantis.ucrop.isDragImages", true));
    }

    public final void D(float f10) {
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    public final void E(int i10) {
        TextView textView = this.M;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void F(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        z(intent);
        if (uri == null || uri2 == null) {
            H(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.D.k(uri, j.u(this, this.B, uri, uri2), this.f53730q);
        } catch (Exception e10) {
            H(e10);
            finish();
        }
    }

    public final void G() {
        if (!this.f53739z) {
            C(0);
        } else if (this.F.getVisibility() == 0) {
            M(R$id.state_aspect_ratio);
        } else {
            M(R$id.state_scale);
        }
    }

    public void H(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    public void I(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11).putExtra("com.yalantis.ucrop.CropInputOriginal", j.e((Uri) getIntent().getParcelableExtra("com.yalantis.ucrop.InputUri"))));
    }

    public final void J(float f10) {
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    public final void K(int i10) {
        TextView textView = this.N;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @TargetApi(21)
    public final void L(@ColorInt int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    public final void M(@IdRes int i10) {
        if (this.f53739z) {
            ViewGroup viewGroup = this.F;
            int i11 = R$id.state_aspect_ratio;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.G;
            int i12 = R$id.state_rotate;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.H;
            int i13 = R$id.state_scale;
            viewGroup3.setSelected(i10 == i13);
            this.I.setVisibility(i10 == i11 ? 0 : 8);
            this.J.setVisibility(i10 == i12 ? 0 : 8);
            this.K.setVisibility(i10 == i13 ? 0 : 8);
            v(i10);
            if (i10 == i13) {
                C(0);
            } else if (i10 == i12) {
                C(1);
            } else {
                C(2);
            }
        }
    }

    public final void N() {
        L(this.f53732s);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f53731r);
        toolbar.setTitleTextColor(this.f53734u);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f53734u);
        textView.setText(this.f53728o);
        textView.setTextSize(this.f53729p);
        Drawable drawableMutate = AppCompatResources.getDrawable(this, this.f53736w).mutate();
        drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53734u, BlendModeCompat.SRC_ATOP));
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public final void O(@NonNull Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList<AspectRatio> parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayListExtra) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f53733t);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.L.add(frameLayout);
        }
        this.L.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new b());
        }
    }

    public final void P() {
        this.M = (TextView) findViewById(R$id.text_view_rotate);
        int i10 = R$id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f53733t);
        findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new d());
        findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new e());
        E(this.f53733t);
    }

    public final void Q() {
        this.N = (TextView) findViewById(R$id.text_view_scale);
        int i10 = R$id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f53733t);
        K(this.f53733t);
    }

    public final void R() {
        ImageView imageView = (ImageView) findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.f53733t));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.f53733t));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.f53733t));
    }

    public final void S(@NonNull Intent intent) {
        this.B = intent.getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false);
        this.f53732s = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f53731r = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f53733t = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor(this, R$color.ucrop_color_active_controls_color));
        this.f53734u = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f53736w = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f53737x = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        this.f53728o = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f53729p = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarTitleTextSize", 18);
        String string = this.f53728o;
        if (string == null) {
            string = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f53728o = string;
        this.f53738y = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(this, R$color.ucrop_color_default_logo));
        this.f53739z = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f53735v = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(this, R$color.ucrop_color_crop_background));
        N();
        y();
        if (this.f53739z) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R$id.ucrop_photobox)).findViewById(R$id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R$layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.P = autoTransition;
            autoTransition.setDuration(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R$id.state_aspect_ratio);
            this.F = viewGroup2;
            viewGroup2.setOnClickListener(this.U);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R$id.state_rotate);
            this.G = viewGroup3;
            viewGroup3.setOnClickListener(this.U);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R$id.state_scale);
            this.H = viewGroup4;
            viewGroup4.setOnClickListener(this.U);
            this.I = (ViewGroup) findViewById(R$id.layout_aspect_ratio);
            this.J = (ViewGroup) findViewById(R$id.layout_rotate_wheel);
            this.K = (ViewGroup) findViewById(R$id.layout_scale_wheel);
            O(intent);
            P();
            Q();
            R();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x();
        setContentView(R$layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        S(intent);
        F(intent);
        G();
        u();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R$id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53734u, BlendModeCompat.SRC_ATOP));
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", e10.getMessage(), getString(R$string.ucrop_mutate_exception_hint)));
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f53737x);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53734u, BlendModeCompat.SRC_ATOP));
            menuItemFindItem2.setIcon(drawable);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        rf.b.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.menu_crop) {
            w();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.A);
        menu.findItem(R$id.menu_loader).setVisible(this.A);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.D;
        if (gestureCropImageView != null) {
            gestureCropImageView.s();
        }
    }

    public final void u() {
        if (this.O == null) {
            this.O = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R$id.toolbar);
            this.O.setLayoutParams(layoutParams);
            this.O.setClickable(true);
        }
        ((RelativeLayout) findViewById(R$id.ucrop_photobox)).addView(this.O);
    }

    public final void v(int i10) {
        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R$id.ucrop_photobox), this.P);
        this.H.findViewById(R$id.text_view_scale).setVisibility(i10 == R$id.state_scale ? 0 : 8);
        this.F.findViewById(R$id.text_view_crop).setVisibility(i10 == R$id.state_aspect_ratio ? 0 : 8);
        this.G.findViewById(R$id.text_view_rotate).setVisibility(i10 != R$id.state_rotate ? 8 : 0);
    }

    public void w() {
        this.O.setClickable(true);
        this.A = true;
        supportInvalidateOptionsMenu();
        this.D.t(this.Q, this.R, new h());
    }

    public final void x() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("com.yalantis.ucrop.isDarkStatusBarBlack", false);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f53732s = intExtra;
        uf.a.a(this, intExtra, intExtra, booleanExtra);
    }

    public final void y() {
        UCropView uCropView = (UCropView) findViewById(R$id.ucrop);
        this.C = uCropView;
        this.D = uCropView.getCropImageView();
        this.E = this.C.getOverlayView();
        this.D.setTransformImageListener(this.T);
        ((ImageView) findViewById(R$id.image_view_logo)).setColorFilter(this.f53738y, PorterDuff.Mode.SRC_ATOP);
        int i10 = R$id.ucrop_frame;
        findViewById(i10).setBackgroundColor(this.f53735v);
        if (this.f53739z) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
        findViewById(i10).requestLayout();
    }

    public final void z(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.Q = compressFormatValueOf;
        this.R = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.S = intArrayExtra;
        }
        this.f53730q = intent.getBooleanExtra("com.yalantis.ucrop.CustomLoaderCropBitmap", false);
        this.D.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.D.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.D.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.E.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.E.setDragSmoothToCenter(intent.getBooleanExtra("com.yalantis.ucrop.DragSmoothToCenter", false));
        OverlayView overlayView = this.E;
        Resources resources = getResources();
        int i10 = R$color.ucrop_color_default_dimmed;
        overlayView.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", resources.getColor(i10)));
        this.E.setCircleStrokeColor(intent.getIntExtra("com.yalantis.ucrop.CircleStrokeColor", getResources().getColor(i10)));
        this.E.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.E.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.E.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.E.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.E.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.E.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.E.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.E.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        OverlayView overlayView2 = this.E;
        Resources resources2 = getResources();
        int i11 = R$dimen.ucrop_default_crop_grid_stoke_width;
        overlayView2.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", resources2.getDimensionPixelSize(i11)));
        this.E.setDimmedStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CircleStrokeWidth", getResources().getDimensionPixelSize(i11)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.F;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f10 = floatExtra / floatExtra2;
            this.D.setTargetAspectRatio(Float.isNaN(f10) ? 0.0f : f10);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.D.setTargetAspectRatio(0.0f);
        } else {
            float fD = ((AspectRatio) parcelableArrayListExtra.get(intExtra)).d() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).e();
            this.D.setTargetAspectRatio(Float.isNaN(fD) ? 0.0f : fD);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.D.setMaxResultImageSizeX(intExtra2);
        this.D.setMaxResultImageSizeY(intExtra3);
    }
}
