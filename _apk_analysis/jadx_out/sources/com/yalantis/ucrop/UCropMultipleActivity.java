package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yalantis.ucrop.UCropFragment;
import com.yalantis.ucrop.UCropGalleryAdapter;
import com.yalantis.ucrop.decoration.GridSpacingItemDecoration;
import com.yalantis.ucrop.model.AspectRatio;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import wf.c;
import wf.j;

/* JADX INFO: loaded from: classes4.dex */
public class UCropMultipleActivity extends AppCompatActivity implements b {
    public ArrayList<String> A;
    public String C;
    public UCropGalleryAdapter D;
    public boolean E;
    public boolean F;
    public ArrayList<AspectRatio> G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f53790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f53791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @DrawableRes
    public int f53794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @DrawableRes
    public int f53795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f53796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f53797v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UCropFragment f53799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f53800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList<String> f53801z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<UCropFragment> f53798w = new ArrayList();
    public final LinkedHashMap<String, JSONObject> B = new LinkedHashMap<>();
    public final HashSet<String> H = new HashSet<>();

    public class a implements UCropGalleryAdapter.b {
        public a() {
        }

        @Override // com.yalantis.ucrop.UCropGalleryAdapter.b
        public void a(int i10, View view) {
            if (UCropMultipleActivity.this.F) {
                return;
            }
            if (UCropMultipleActivity.this.H.contains(UCropMultipleActivity.this.s((String) UCropMultipleActivity.this.f53801z.get(i10)))) {
                Toast.makeText(UCropMultipleActivity.this.getApplicationContext(), UCropMultipleActivity.this.getString(R$string.ucrop_not_crop), 0).show();
                return;
            }
            if (UCropMultipleActivity.this.D.d() == i10) {
                return;
            }
            UCropMultipleActivity.this.D.notifyItemChanged(UCropMultipleActivity.this.D.d());
            UCropMultipleActivity.this.D.g(i10);
            UCropMultipleActivity.this.D.notifyItemChanged(i10);
            UCropMultipleActivity.this.D((UCropFragment) UCropMultipleActivity.this.f53798w.get(i10), i10);
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @TargetApi(21)
    public final void A(@ColorInt int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    public final void B() {
        A(this.f53793r);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f53792q);
        toolbar.setTitleTextColor(this.f53796u);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f53796u);
        textView.setText(this.f53790o);
        textView.setTextSize(this.f53791p);
        Drawable drawableMutate = AppCompatResources.getDrawable(this, this.f53794s).mutate();
        drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53796u, BlendModeCompat.SRC_ATOP));
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public final void C(@NonNull Intent intent) {
        this.G = getIntent().getParcelableArrayListExtra("com.yalantis.ucrop.MultipleAspectRatio");
        this.E = intent.getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false);
        this.C = intent.getStringExtra("com.yalantis.ucrop.CropOutputFileName");
        this.f53793r = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f53792q = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f53796u = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f53794s = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f53795t = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        this.f53790o = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f53791p = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarTitleTextSize", 18);
        String string = this.f53790o;
        if (string == null) {
            string = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f53790o = string;
        B();
    }

    public final void D(UCropFragment uCropFragment, int i10) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (uCropFragment.isAdded()) {
            fragmentTransactionBeginTransaction.hide(this.f53799x).show(uCropFragment);
            uCropFragment.p();
        } else {
            UCropFragment uCropFragment2 = this.f53799x;
            if (uCropFragment2 != null) {
                fragmentTransactionBeginTransaction.hide(uCropFragment2);
            }
            fragmentTransactionBeginTransaction.add(R$id.fragment_container, uCropFragment, UCropFragment.B + "-" + i10);
        }
        this.f53800y = i10;
        this.f53799x = uCropFragment;
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.yalantis.ucrop.b
    public void loadingProgress(boolean z10) {
        this.f53797v = z10;
        supportInvalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        v();
        setContentView(R$layout.ucrop_activity_multiple);
        C(getIntent());
        w();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R$id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53796u, BlendModeCompat.SRC_ATOP));
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f53795t);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f53796u, BlendModeCompat.SRC_ATOP));
        menuItemFindItem2.setIcon(drawable);
        return true;
    }

    @Override // com.yalantis.ucrop.b
    public void onCropFinish(UCropFragment.i iVar) {
        int i10 = iVar.f53781a;
        if (i10 != -1) {
            if (i10 != 96) {
                return;
            }
            u(iVar.f53782b);
            return;
        }
        int size = this.f53800y + this.A.size();
        boolean z10 = true;
        int size2 = (this.A.size() + this.f53801z.size()) - 1;
        x(iVar.f53782b);
        if (size == size2) {
            y();
            return;
        }
        int i11 = this.f53800y + 1;
        String strS = s(this.f53801z.get(i11));
        while (true) {
            if (!this.H.contains(strS)) {
                z10 = false;
                break;
            } else {
                if (i11 == size2) {
                    break;
                }
                i11++;
                strS = s(this.f53801z.get(i11));
            }
        }
        if (z10) {
            y();
            return;
        }
        D(this.f53798w.get(i11), i11);
        UCropGalleryAdapter uCropGalleryAdapter = this.D;
        uCropGalleryAdapter.notifyItemChanged(uCropGalleryAdapter.d());
        this.D.g(i11);
        UCropGalleryAdapter uCropGalleryAdapter2 = this.D;
        uCropGalleryAdapter2.notifyItemChanged(uCropGalleryAdapter2.d());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        rf.b.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.menu_crop) {
            UCropFragment uCropFragment = this.f53799x;
            if (uCropFragment != null && uCropFragment.isAdded()) {
                this.f53799x.o();
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.f53797v);
        menu.findItem(R$id.menu_loader).setVisible(this.f53797v);
        return super.onPrepareOptionsMenu(menu);
    }

    public final int r() {
        ArrayList<String> stringArrayList = getIntent().getExtras().getStringArrayList("com.yalantis.ucrop.SkipCropMimeType");
        if (stringArrayList == null || stringArrayList.size() <= 0) {
            return 0;
        }
        this.H.addAll(stringArrayList);
        int i10 = -1;
        for (int i11 = 0; i11 < this.f53801z.size(); i11++) {
            i10++;
            if (!this.H.contains(s(this.f53801z.get(i11)))) {
                break;
            }
        }
        if (i10 == -1 || i10 > this.f53798w.size()) {
            return 0;
        }
        return i10;
    }

    public final String s(String str) {
        return j.j(str) ? j.f(this, Uri.parse(str)) : j.f(this, Uri.fromFile(new File(str)));
    }

    public final String t() {
        String stringExtra = getIntent().getStringExtra("com.yalantis.ucrop.CropOutputDir");
        File file = (stringExtra == null || "".equals(stringExtra)) ? new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), "Sandbox") : new File(stringExtra);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public final void u(@NonNull Intent intent) {
        Throwable thA = com.yalantis.ucrop.a.a(intent);
        if (thA != null) {
            Toast.makeText(this, thA.getMessage(), 1).show();
        } else {
            Toast.makeText(this, "Unexpected error", 0).show();
        }
    }

    public final void v() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("com.yalantis.ucrop.isDarkStatusBarBlack", false);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f53793r = intExtra;
        uf.a.a(this, intExtra, intExtra, booleanExtra);
    }

    public final void w() {
        String str;
        int i10 = 0;
        this.F = getIntent().getBooleanExtra("com.yalantis.ucrop.ForbidSkipCrop", false);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("com.yalantis.ucrop.CropTotalDataSource");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            throw new IllegalArgumentException("Missing required parameters, count cannot be less than 1");
        }
        this.f53801z = new ArrayList<>();
        this.A = new ArrayList<>();
        while (i10 < stringArrayListExtra.size()) {
            String str2 = stringArrayListExtra.get(i10);
            this.B.put(str2, new JSONObject());
            String strG = j.j(str2) ? j.g(this, Uri.parse(str2)) : str2;
            String strS = s(str2);
            if (j.s(strG) || j.q(strS) || j.o(strS)) {
                this.A.add(str2);
            } else {
                this.f53801z.add(str2);
                Bundle extras = getIntent().getExtras();
                Uri uriFromFile = (j.j(str2) || j.p(str2)) ? Uri.parse(str2) : Uri.fromFile(new File(str2));
                String strI = j.i(this, this.E, uriFromFile);
                if (TextUtils.isEmpty(this.C)) {
                    str = j.c("CROP_") + strI;
                } else {
                    str = j.b() + "_" + this.C;
                }
                Uri uriFromFile2 = Uri.fromFile(new File(t(), str));
                extras.putParcelable("com.yalantis.ucrop.InputUri", uriFromFile);
                extras.putParcelable("com.yalantis.ucrop.OutputUri", uriFromFile2);
                ArrayList<AspectRatio> arrayList = this.G;
                AspectRatio aspectRatio = (arrayList == null || arrayList.size() <= i10) ? null : this.G.get(i10);
                extras.putFloat("com.yalantis.ucrop.AspectRatioX", aspectRatio != null ? aspectRatio.d() : -1.0f);
                extras.putFloat("com.yalantis.ucrop.AspectRatioY", aspectRatio != null ? aspectRatio.e() : -1.0f);
                this.f53798w.add(UCropFragment.t(extras));
            }
            i10++;
        }
        if (this.f53801z.size() == 0) {
            throw new IllegalArgumentException("No clipping data sources are available");
        }
        z();
        D(this.f53798w.get(r()), r());
        this.D.g(r());
    }

    public final void x(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CropInputOriginal");
            JSONObject jSONObject = this.B.get(stringExtra);
            Uri uriC = com.yalantis.ucrop.a.c(intent);
            jSONObject.put("outPutPath", uriC != null ? uriC.getPath() : "");
            jSONObject.put("imageWidth", com.yalantis.ucrop.a.h(intent));
            jSONObject.put("imageHeight", com.yalantis.ucrop.a.e(intent));
            jSONObject.put("offsetX", com.yalantis.ucrop.a.f(intent));
            jSONObject.put("offsetY", com.yalantis.ucrop.a.g(intent));
            jSONObject.put("aspectRatio", com.yalantis.ucrop.a.d(intent));
            this.B.put(stringExtra, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void y() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, JSONObject>> it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getValue());
        }
        Intent intent = new Intent();
        intent.putExtra("output", jSONArray.toString());
        setResult(-1, intent);
        finish();
    }

    public final void z() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.recycler_gallery);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(Integer.MAX_VALUE, c.a(this, 6.0f), true));
        }
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this, R$anim.ucrop_layout_animation_fall_down));
        recyclerView.setBackgroundResource(getIntent().getIntExtra("com.yalantis.ucrop.GalleryBarBackground", R$drawable.ucrop_gallery_bg));
        UCropGalleryAdapter uCropGalleryAdapter = new UCropGalleryAdapter(this.f53801z);
        this.D = uCropGalleryAdapter;
        uCropGalleryAdapter.h(new a());
        recyclerView.setAdapter(this.D);
    }
}
