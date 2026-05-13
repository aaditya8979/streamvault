package com.luck.picture.lib;

import ab.l;
import ab.r;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import java.util.List;
import ra.a0;
import ra.p;

/* JADX INFO: loaded from: classes6.dex */
public class PictureSelectorSystemFragment extends PictureCommonFragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f34816r = PictureSelectorSystemFragment.class.getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActivityResultLauncher<String> f34817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActivityResultLauncher<String> f34818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActivityResultLauncher<String> f34819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActivityResultLauncher<String> f34820q;

    public class a implements ActivityResultCallback<Uri> {
        public a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(uri.toString());
            localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
            if (PictureSelectorSystemFragment.this.u(localMediaI, false) == 0) {
                PictureSelectorSystemFragment.this.H();
            } else {
                PictureSelectorSystemFragment.this.j0();
            }
        }
    }

    public class b implements xa.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f34822a;

        public b(String[] strArr) {
            this.f34822a = strArr;
        }

        @Override // xa.c
        public void a() {
            PictureSelectorSystemFragment.this.Q(this.f34822a);
        }

        @Override // xa.c
        public void onGranted() {
            PictureSelectorSystemFragment.this.e1();
        }
    }

    public class c implements a0 {
        public c() {
        }
    }

    public class d extends ActivityResultContract<String, List<Uri>> {
        public d() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType(str);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List<Uri> parseResult(int i10, @Nullable Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent == null) {
                return arrayList;
            }
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                int itemCount = clipData.getItemCount();
                for (int i11 = 0; i11 < itemCount; i11++) {
                    arrayList.add(clipData.getItemAt(i11).getUri());
                }
            } else if (intent.getData() != null) {
                arrayList.add(intent.getData());
            }
            return arrayList;
        }
    }

    public class e implements ActivityResultCallback<List<Uri>> {
        public e() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List<Uri> list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(list.get(i10).toString());
                localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
                va.a.c(localMediaI);
            }
            PictureSelectorSystemFragment.this.H();
        }
    }

    public class f extends ActivityResultContract<String, Uri> {
        public f() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType(str);
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, @Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    public class g implements ActivityResultCallback<Uri> {
        public g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(uri.toString());
            localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
            if (PictureSelectorSystemFragment.this.u(localMediaI, false) == 0) {
                PictureSelectorSystemFragment.this.H();
            } else {
                PictureSelectorSystemFragment.this.j0();
            }
        }
    }

    public class h extends ActivityResultContract<String, List<Uri>> {
        public h() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent = TextUtils.equals("video/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List<Uri> parseResult(int i10, @Nullable Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent == null) {
                return arrayList;
            }
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                int itemCount = clipData.getItemCount();
                for (int i11 = 0; i11 < itemCount; i11++) {
                    arrayList.add(clipData.getItemAt(i11).getUri());
                }
            } else if (intent.getData() != null) {
                arrayList.add(intent.getData());
            }
            return arrayList;
        }
    }

    public class i implements ActivityResultCallback<List<Uri>> {
        public i() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List<Uri> list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(list.get(i10).toString());
                localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
                va.a.c(localMediaI);
            }
            PictureSelectorSystemFragment.this.H();
        }
    }

    public class j extends ActivityResultContract<String, Uri> {
        public j() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            return TextUtils.equals("video/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, @Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    public static PictureSelectorSystemFragment d1() {
        return new PictureSelectorSystemFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        return R$layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void R(String[] strArr) {
        m0(false, null);
        p pVar = PictureSelectionConfig.f34981a1;
        if (pVar != null ? pVar.a(this, strArr) : xa.a.f(this.f34945f.f34999b, getContext())) {
            e1();
        } else {
            r.c(getContext(), getString(R$string.ps_jurisdiction));
            j0();
        }
        xa.b.f86887a = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void W(int i10, String[] strArr) {
        if (i10 == -2) {
            PictureSelectionConfig.f34981a1.b(this, xa.b.a(this.f34945f.f34999b), new c());
        }
    }

    public final void X0() {
        this.f34820q = registerForActivityResult(new j(), new a());
    }

    public final void Y0() {
        this.f34819p = registerForActivityResult(new h(), new i());
    }

    public final void Z0() {
        this.f34817n = registerForActivityResult(new d(), new e());
    }

    public final void a1() {
        this.f34818o = registerForActivityResult(new f(), new g());
    }

    public final void b1() {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.f35017k == 1) {
            if (pictureSelectionConfig.f34999b == ma.e.a()) {
                a1();
                return;
            } else {
                X0();
                return;
            }
        }
        if (pictureSelectionConfig.f34999b == ma.e.a()) {
            Z0();
        } else {
            Y0();
        }
    }

    public final String c1() {
        return this.f34945f.f34999b == ma.e.d() ? "video/*" : this.f34945f.f34999b == ma.e.b() ? "audio/*" : "image/*";
    }

    public final void e1() {
        m0(false, null);
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.f35017k == 1) {
            if (pictureSelectionConfig.f34999b == ma.e.a()) {
                this.f34818o.launch("image/*,video/*");
                return;
            } else {
                this.f34820q.launch(c1());
                return;
            }
        }
        if (pictureSelectionConfig.f34999b == ma.e.a()) {
            this.f34817n.launch("image/*,video/*");
        } else {
            this.f34819p.launch(c1());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            j0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher<String> activityResultLauncher = this.f34817n;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher2 = this.f34818o;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher3 = this.f34819p;
        if (activityResultLauncher3 != null) {
            activityResultLauncher3.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher4 = this.f34820q;
        if (activityResultLauncher4 != null) {
            activityResultLauncher4.unregister();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        b1();
        if (xa.a.f(this.f34945f.f34999b, getContext())) {
            e1();
            return;
        }
        String[] strArrA = xa.b.a(this.f34945f.f34999b);
        m0(true, strArrA);
        if (PictureSelectionConfig.f34981a1 != null) {
            W(-2, strArrA);
        } else {
            xa.a.b().requestPermissions(this, strArrA, new b(strArrA));
        }
    }
}
