package com.luck.picture.lib.basic;

import ab.p;
import ab.r;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$raw;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.dialog.PhotoItemSelectedDialog;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.service.ForegroundService;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ra.a0;
import ra.b0;
import ra.d0;
import ra.e0;
import ra.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PictureCommonFragment extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f34940m = PictureCommonFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xa.c f34941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.luck.picture.lib.basic.a f34942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34943d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ta.a f34944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PictureSelectionConfig f34945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f34946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SoundPool f34947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Dialog f34950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f34951l;

    public class a implements ra.d<ArrayList<LocalMedia>> {
        public a() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ArrayList<LocalMedia> arrayList) {
            PictureCommonFragment.this.o0(arrayList);
        }
    }

    public class b implements ra.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f34953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34954b;

        public b(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f34953a = concurrentHashMap;
            this.f34954b = arrayList;
        }

        @Override // ra.l
        public void a(String str, String str2) {
            LocalMedia localMedia = (LocalMedia) this.f34953a.get(str);
            if (localMedia != null) {
                localMedia.u0(str2);
                this.f34953a.remove(str);
            }
            if (this.f34953a.size() == 0) {
                PictureCommonFragment.this.Y(this.f34954b);
            }
        }
    }

    public class c implements ra.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f34957b;

        public c(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f34956a = arrayList;
            this.f34957b = concurrentHashMap;
        }

        @Override // ra.l
        public void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                PictureCommonFragment.this.J(this.f34956a);
                return;
            }
            LocalMedia localMedia = (LocalMedia) this.f34957b.get(str);
            if (localMedia != null) {
                localMedia.v0(str2);
                this.f34957b.remove(str);
            }
            if (this.f34957b.size() == 0) {
                PictureCommonFragment.this.J(this.f34956a);
            }
        }
    }

    public class d extends PictureThreadUtils.d<ArrayList<LocalMedia>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f34959i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34960j;

        public class a implements ra.l {
            public a() {
            }

            @Override // ra.l
            public void a(String str, String str2) {
                LocalMedia localMedia;
                if (TextUtils.isEmpty(str) || (localMedia = (LocalMedia) d.this.f34959i.get(str)) == null) {
                    return;
                }
                if (TextUtils.isEmpty(localMedia.z())) {
                    localMedia.s0(str2);
                }
                if (PictureCommonFragment.this.f34945f.T) {
                    localMedia.n0(str2);
                    localMedia.m0(!TextUtils.isEmpty(str2));
                }
                d.this.f34959i.remove(str);
            }
        }

        public d(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f34959i = concurrentHashMap;
            this.f34960j = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ArrayList<LocalMedia> g() {
            Iterator it = this.f34959i.entrySet().iterator();
            while (it.hasNext()) {
                LocalMedia localMedia = (LocalMedia) ((Map.Entry) it.next()).getValue();
                if (PictureCommonFragment.this.f34945f.T || TextUtils.isEmpty(localMedia.z())) {
                    PictureSelectionConfig.Q0.a(PictureCommonFragment.this.K(), localMedia.w(), localMedia.s(), new a());
                }
            }
            return this.f34960j;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(ArrayList<LocalMedia> arrayList) {
            PictureThreadUtils.d(this);
            PictureCommonFragment.this.I(arrayList);
        }
    }

    public class e extends PictureThreadUtils.d<ArrayList<LocalMedia>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34963i;

        public class a implements ra.c<LocalMedia> {
            public a() {
            }
        }

        public e(ArrayList arrayList) {
            this.f34963i = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ArrayList<LocalMedia> g() {
            for (int i10 = 0; i10 < this.f34963i.size(); i10++) {
                int i11 = i10;
                PictureSelectionConfig.P0.a(PictureCommonFragment.this.K(), PictureCommonFragment.this.f34945f.T, i11, (LocalMedia) this.f34963i.get(i10), new a());
            }
            return this.f34963i;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(ArrayList<LocalMedia> arrayList) {
            PictureThreadUtils.d(this);
            PictureCommonFragment.this.I(arrayList);
        }
    }

    public class f implements ra.d<Boolean> {
        public f() {
        }

        @Override // ra.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                PictureCommonFragment.this.R(xa.b.f86887a);
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            PictureCommonFragment.this.j0();
            return true;
        }
    }

    public class h implements ra.k {
        public h() {
        }

        @Override // ra.k
        public void a(View view, int i10) {
            if (i10 == 0) {
                if (PictureSelectionConfig.U0 != null) {
                    PictureCommonFragment.this.i0(1);
                    return;
                } else {
                    PictureCommonFragment.this.t0();
                    return;
                }
            }
            if (i10 != 1) {
                return;
            }
            if (PictureSelectionConfig.U0 != null) {
                PictureCommonFragment.this.i0(2);
            } else {
                PictureCommonFragment.this.w0();
            }
        }
    }

    public class i implements PhotoItemSelectedDialog.a {
        public i() {
        }

        @Override // com.luck.picture.lib.dialog.PhotoItemSelectedDialog.a
        public void a(boolean z10, DialogInterface dialogInterface) {
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            if (pictureCommonFragment.f34945f.f35001c && z10) {
                pictureCommonFragment.j0();
            }
        }
    }

    public class j implements xa.c {
        public j() {
        }

        @Override // xa.c
        public void a() {
            PictureCommonFragment.this.Q(xa.b.f86888b);
        }

        @Override // xa.c
        public void onGranted() {
            PictureCommonFragment.this.K0();
        }
    }

    public class k implements xa.c {
        public k() {
        }

        @Override // xa.c
        public void a() {
            PictureCommonFragment.this.Q(xa.b.f86888b);
        }

        @Override // xa.c
        public void onGranted() {
            PictureCommonFragment.this.L0();
        }
    }

    public class l implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34972a;

        public l(int i10) {
            this.f34972a = i10;
        }
    }

    public class m extends PictureThreadUtils.d<LocalMedia> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Intent f34974i;

        public m(Intent intent) {
            this.f34974i = intent;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public LocalMedia g() {
            String strM = PictureCommonFragment.this.M(this.f34974i);
            if (!TextUtils.isEmpty(strM)) {
                PictureCommonFragment.this.f34945f.f35000b0 = strM;
            }
            if (TextUtils.isEmpty(PictureCommonFragment.this.f34945f.f35000b0)) {
                return null;
            }
            if (PictureCommonFragment.this.f34945f.f34999b == ma.e.b()) {
                PictureCommonFragment.this.w();
            }
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            return pictureCommonFragment.i(pictureCommonFragment.f34945f.f35000b0);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(LocalMedia localMedia) {
            PictureThreadUtils.d(this);
            if (localMedia != null) {
                PictureCommonFragment.this.p0(localMedia);
                PictureCommonFragment.this.F(localMedia);
            }
        }
    }

    public class n implements ra.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f34977b;

        public n(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f34976a = arrayList;
            this.f34977b = concurrentHashMap;
        }

        @Override // ra.l
        public void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                PictureCommonFragment.this.o0(this.f34976a);
                return;
            }
            LocalMedia localMedia = (LocalMedia) this.f34977b.get(str);
            if (localMedia != null) {
                if (!ab.l.e()) {
                    localMedia.S(str2);
                    localMedia.T(!TextUtils.isEmpty(str2));
                } else if (!TextUtils.isEmpty(str2) && (str2.contains("Android/data/") || str2.contains("data/user/"))) {
                    localMedia.S(str2);
                    localMedia.T(!TextUtils.isEmpty(str2));
                    localMedia.s0(localMedia.i());
                }
                this.f34977b.remove(str);
            }
            if (this.f34977b.size() == 0) {
                PictureCommonFragment.this.o0(this.f34976a);
            }
        }
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f34980b;

        public o(int i10, Intent intent) {
            this.f34979a = i10;
            this.f34980b = intent;
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    public static String P(Context context, String str, int i10) {
        return ma.d.i(str) ? context.getString(R$string.ps_message_video_max_num, String.valueOf(i10)) : ma.d.d(str) ? context.getString(R$string.ps_message_audio_max_num, String.valueOf(i10)) : context.getString(R$string.ps_message_max_num, String.valueOf(i10));
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment fragment, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        fragment.startActivityForResult(intent, i10);
    }

    public final void A() {
        oa.h hVarA;
        oa.h hVarA2;
        if (PictureSelectionConfig.e().f35040v0 && PictureSelectionConfig.R0 == null && (hVarA2 = ka.b.c().a()) != null) {
            PictureSelectionConfig.R0 = hVarA2.b();
        }
        if (PictureSelectionConfig.e().f35042w0 && PictureSelectionConfig.f34992l1 == null && (hVarA = ka.b.c().a()) != null) {
            PictureSelectionConfig.f34992l1 = hVarA.a();
        }
    }

    public void A0(LocalMedia localMedia) {
        if (ab.a.c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).g0(localMedia);
            }
        }
    }

    public final void B() {
        oa.h hVarA;
        if (PictureSelectionConfig.e().f35032r0 && PictureSelectionConfig.W0 == null && (hVarA = ka.b.c().a()) != null) {
            PictureSelectionConfig.W0 = hVarA.h();
        }
    }

    public void B0(boolean z10, LocalMedia localMedia) {
        if (ab.a.c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).r0(z10, localMedia);
            }
        }
    }

    public final void C() {
        oa.h hVarA;
        oa.h hVarA2;
        if (PictureSelectionConfig.e().f35044x0) {
            if (PictureSelectionConfig.Q0 == null && (hVarA2 = ka.b.c().a()) != null) {
                PictureSelectionConfig.Q0 = hVarA2.j();
            }
            if (PictureSelectionConfig.P0 != null || (hVarA = ka.b.c().a()) == null) {
                return;
            }
            PictureSelectionConfig.P0 = hVarA.d();
        }
    }

    public void C0() {
        if (ab.a.c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).Z();
            }
        }
    }

    public final void D() {
        oa.h hVarA;
        if (PictureSelectionConfig.S0 != null || (hVarA = ka.b.c().a()) == null) {
            return;
        }
        PictureSelectionConfig.S0 = hVarA.e();
    }

    public void D0(long j10) {
        this.f34949j = j10;
    }

    public void E() {
        try {
            if (!ab.a.c(getActivity()) && this.f34946g.isShowing()) {
                this.f34946g.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void E0(xa.c cVar) {
        this.f34941b = cVar;
    }

    public void F(LocalMedia localMedia) {
    }

    public void F0() {
        if (ab.a.c(getActivity())) {
            return;
        }
        getActivity().setRequestedOrientation(this.f34945f.f35013i);
    }

    public final void G(Intent intent) {
        PictureThreadUtils.h(new m(intent));
    }

    public void G0(View view) {
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new g());
    }

    public void H() {
        if (!k() && isAdded()) {
            ArrayList<LocalMedia> arrayList = new ArrayList<>(va.a.n());
            if (m()) {
                b0(arrayList);
                return;
            }
            if (o()) {
                l0(arrayList);
                return;
            }
            if (l()) {
                a0(arrayList);
            } else if (n()) {
                k0(arrayList);
            } else {
                o0(arrayList);
            }
        }
    }

    public final void H0() {
        if (this.f34945f.L) {
            qa.a.c(requireActivity(), PictureSelectionConfig.T0.c().U());
        }
    }

    public final void I(ArrayList<LocalMedia> arrayList) {
        I0();
        if (j()) {
            h(arrayList);
        } else if (s()) {
            N0(arrayList);
        } else {
            Y(arrayList);
        }
    }

    public void I0() {
        try {
            if (ab.a.c(getActivity()) || this.f34946g.isShowing()) {
                return;
            }
            this.f34946g.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void J(ArrayList<LocalMedia> arrayList) {
        if (s()) {
            N0(arrayList);
        } else {
            Y(arrayList);
        }
    }

    public final void J0(String str) {
        if (ab.a.c(getActivity())) {
            return;
        }
        try {
            Dialog dialog = this.f34950k;
            if (dialog == null || !dialog.isShowing()) {
                na.d dVarA = na.d.a(K(), str);
                this.f34950k = dVarA;
                dVarA.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public Context K() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        Context contextB = ka.b.c().b();
        return contextB != null ? contextB : this.f34951l;
    }

    public void K0() {
        if (ab.a.c(getActivity())) {
            return;
        }
        m0(false, null);
        if (PictureSelectionConfig.U0 != null) {
            i0(1);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.c(K());
            Uri uriC = ab.i.c(K(), this.f34945f);
            if (uriC != null) {
                if (this.f34945f.f35015j) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                }
                intent.putExtra("output", uriC);
                safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
            }
        }
    }

    public long L() {
        long j10 = this.f34949j;
        if (j10 > 50) {
            j10 -= 50;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    public void L0() {
        if (ab.a.c(getActivity())) {
            return;
        }
        m0(false, null);
        if (PictureSelectionConfig.U0 != null) {
            i0(2);
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.c(K());
            Uri uriD = ab.i.d(K(), this.f34945f);
            if (uriD != null) {
                intent.putExtra("output", uriD);
                if (this.f34945f.f35015j) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                }
                intent.putExtra("android.intent.extra.quickCapture", this.f34945f.f35018k0);
                intent.putExtra("android.intent.extra.durationLimit", this.f34945f.f35039v);
                intent.putExtra("android.intent.extra.videoQuality", this.f34945f.f35029q);
                safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
            }
        }
    }

    public String M(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri data = (Uri) intent.getParcelableExtra("output");
        if (this.f34945f.f34999b == ma.e.b() && data == null) {
            data = intent.getData();
        }
        if (data == null) {
            return null;
        }
        return ma.d.c(data.toString()) ? data.toString() : data.getPath();
    }

    public final void M0(ArrayList<LocalMedia> arrayList) {
        I0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            concurrentHashMap.put(localMedia.w(), localMedia);
        }
        if (concurrentHashMap.size() == 0) {
            I(arrayList);
        } else {
            PictureThreadUtils.h(new d(concurrentHashMap, arrayList));
        }
    }

    public int N() {
        return 0;
    }

    public final void N0(ArrayList<LocalMedia> arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            String strF = localMedia.f();
            if (ma.d.i(localMedia.s()) || ma.d.o(strF)) {
                concurrentHashMap.put(strF, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            Y(arrayList);
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            PictureSelectionConfig.f34990j1.a(K(), (String) ((Map.Entry) it.next()).getKey(), new b(concurrentHashMap, arrayList));
        }
    }

    public o O(int i10, ArrayList<LocalMedia> arrayList) {
        return new o(i10, arrayList != null ? la.j.d(arrayList) : null);
    }

    public void Q(String[] strArr) {
        xa.b.f86887a = strArr;
        if (strArr != null && strArr.length > 0) {
            p.c(K(), strArr[0], true);
        }
        if (PictureSelectionConfig.f34986f1 == null) {
            xa.d.a(this, 1102);
        } else {
            m0(false, null);
            PictureSelectionConfig.f34986f1.a(this, strArr, 1102, new f());
        }
    }

    public void R(String[] strArr) {
    }

    public void S() {
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        if (pictureSelectionConfigE.C != -2) {
            sa.b.d(getActivity(), pictureSelectionConfigE.C, pictureSelectionConfigE.D);
        }
    }

    public int T(LocalMedia localMedia, boolean z10) {
        String strS = localMedia.s();
        long jO = localMedia.o();
        long jA = localMedia.A();
        ArrayList<LocalMedia> arrayListN = va.a.n();
        if (!this.f34945f.Q) {
            return q(localMedia, z10, strS, va.a.o(), jA, jO) ? -1 : 200;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayListN.size(); i11++) {
            if (ma.d.i(arrayListN.get(i11).s())) {
                i10++;
            }
        }
        return t(localMedia, z10, strS, i10, jA, jO) ? -1 : 200;
    }

    public boolean U() {
        return (getActivity() instanceof PictureSelectorSupporterActivity) || (getActivity() instanceof PictureSelectorTransparentActivity);
    }

    public final void V(ArrayList<LocalMedia> arrayList) {
        if (this.f34945f.T) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia = arrayList.get(i10);
                localMedia.m0(true);
                localMedia.n0(localMedia.w());
            }
        }
    }

    public void W(int i10, String[] strArr) {
        PictureSelectionConfig.f34981a1.b(this, strArr, new l(i10));
    }

    public void X() {
        if (!ab.a.c(getActivity()) && !isStateSaved()) {
            la.c cVar = PictureSelectionConfig.f34991k1;
            if (cVar != null) {
                cVar.b(this);
            }
            getActivity().getSupportFragmentManager().popBackStack();
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).h0();
            }
        }
    }

    public final void Y(ArrayList<LocalMedia> arrayList) {
        if (ab.a.c(getActivity())) {
            return;
        }
        E();
        if (this.f34945f.f35036t0) {
            getActivity().setResult(-1, la.j.d(arrayList));
            q0(-1, arrayList);
        } else {
            b0<LocalMedia> b0Var = PictureSelectionConfig.W0;
            if (b0Var != null) {
                b0Var.a(arrayList);
            }
        }
        f0();
    }

    public void Z() {
    }

    public void a0(ArrayList<LocalMedia> arrayList) {
        I0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList<Uri> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            String strF = localMedia.f();
            if (!ma.d.g(strF)) {
                PictureSelectionConfig pictureSelectionConfig = this.f34945f;
                if ((!pictureSelectionConfig.T || !pictureSelectionConfig.I0) && ma.d.h(localMedia.s())) {
                    arrayList2.add(ma.d.c(strF) ? Uri.parse(strF) : Uri.fromFile(new File(strF)));
                    concurrentHashMap.put(strF, localMedia);
                }
            }
        }
        if (concurrentHashMap.size() == 0) {
            o0(arrayList);
        } else {
            PictureSelectionConfig.M0.a(K(), arrayList2, new n(arrayList, concurrentHashMap));
        }
    }

    public void b0(ArrayList<LocalMedia> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Uri uriFromFile = null;
        Uri uriFromFile2 = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            arrayList2.add(localMedia.f());
            if (uriFromFile == null && ma.d.h(localMedia.s())) {
                String strF = localMedia.f();
                uriFromFile = (ma.d.c(strF) || ma.d.g(strF)) ? Uri.parse(strF) : Uri.fromFile(new File(strF));
                uriFromFile2 = Uri.fromFile(new File(new File(ab.h.b(K(), 1)).getAbsolutePath(), ab.d.c("CROP_") + ".jpg"));
            }
        }
        PictureSelectionConfig.O0.a(this, uriFromFile, uriFromFile2, arrayList2, 69);
    }

    public void c0(Intent intent) {
    }

    public void d0() {
    }

    public void e0() {
    }

    public void f0() {
        if (!ab.a.c(getActivity())) {
            if (U()) {
                la.c cVar = PictureSelectionConfig.f34991k1;
                if (cVar != null) {
                    cVar.b(this);
                }
                getActivity().finish();
            } else {
                List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
                for (int i10 = 0; i10 < fragments.size(); i10++) {
                    if (fragments.get(i10) instanceof PictureCommonFragment) {
                        X();
                    }
                }
            }
        }
        PictureSelectionConfig.c();
    }

    public void g0(LocalMedia localMedia) {
    }

    public final void h(ArrayList<LocalMedia> arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = arrayList.get(i10);
            if (!ma.d.d(localMedia.s())) {
                concurrentHashMap.put(localMedia.f(), localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            J(arrayList);
            return;
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            PictureSelectionConfig.f34989i1.a(K(), (String) entry.getKey(), ((LocalMedia) entry.getValue()).s(), new c(arrayList, concurrentHashMap));
        }
    }

    public void h0() {
    }

    public LocalMedia i(String str) throws Throwable {
        LocalMedia localMediaE = LocalMedia.e(K(), str);
        localMediaE.R(this.f34945f.f34999b);
        if (!ab.l.e() || ma.d.c(str)) {
            localMediaE.s0(null);
        } else {
            localMediaE.s0(str);
        }
        if (this.f34945f.f35020l0 && ma.d.h(localMediaE.s())) {
            ab.c.e(K(), str);
        }
        return localMediaE;
    }

    public void i0(int i10) {
        ForegroundService.c(K());
        PictureSelectionConfig.U0.a(this, i10, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
    }

    public boolean j() {
        return PictureSelectionConfig.f34989i1 != null;
    }

    public void j0() {
        if (ab.a.c(getActivity())) {
            return;
        }
        if (this.f34945f.f35036t0) {
            getActivity().setResult(0);
            q0(0, null);
        } else {
            b0<LocalMedia> b0Var = PictureSelectionConfig.W0;
            if (b0Var != null) {
                b0Var.onCancel();
            }
        }
        f0();
    }

    public final boolean k() {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.f35017k == 2 && !pictureSelectionConfig.f35001c) {
            if (pictureSelectionConfig.Q) {
                ArrayList<LocalMedia> arrayListN = va.a.n();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < arrayListN.size(); i12++) {
                    if (ma.d.i(arrayListN.get(i12).s())) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
                PictureSelectionConfig pictureSelectionConfig2 = this.f34945f;
                int i13 = pictureSelectionConfig2.f35021m;
                if (i13 > 0 && i10 < i13) {
                    e0 e0Var = PictureSelectionConfig.V0;
                    if (e0Var != null && e0Var.a(K(), null, this.f34945f, 5)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_img_num, String.valueOf(this.f34945f.f35021m)));
                    return true;
                }
                int i14 = pictureSelectionConfig2.f35025o;
                if (i14 > 0 && i11 < i14) {
                    e0 e0Var2 = PictureSelectionConfig.V0;
                    if (e0Var2 != null && e0Var2.a(K(), null, this.f34945f, 7)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_video_num, String.valueOf(this.f34945f.f35025o)));
                    return true;
                }
            } else {
                String strO = va.a.o();
                if (ma.d.h(strO) && this.f34945f.f35021m > 0 && va.a.l() < this.f34945f.f35021m) {
                    e0 e0Var3 = PictureSelectionConfig.V0;
                    if (e0Var3 != null && e0Var3.a(K(), null, this.f34945f, 5)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_img_num, String.valueOf(this.f34945f.f35021m)));
                    return true;
                }
                if (ma.d.i(strO) && this.f34945f.f35025o > 0 && va.a.l() < this.f34945f.f35025o) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), null, this.f34945f, 7)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_video_num, String.valueOf(this.f34945f.f35025o)));
                    return true;
                }
                if (ma.d.d(strO) && this.f34945f.f35027p > 0 && va.a.l() < this.f34945f.f35027p) {
                    e0 e0Var5 = PictureSelectionConfig.V0;
                    if (e0Var5 != null && e0Var5.a(K(), null, this.f34945f, 12)) {
                        return true;
                    }
                    J0(getString(R$string.ps_min_audio_num, String.valueOf(this.f34945f.f35027p)));
                    return true;
                }
            }
        }
        return false;
    }

    public void k0(ArrayList<LocalMedia> arrayList) {
        I0();
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig.T && pictureSelectionConfig.I0) {
            o0(arrayList);
        } else {
            PictureSelectionConfig.L0.a(K(), arrayList, new a());
        }
    }

    public boolean l() {
        if (PictureSelectionConfig.M0 != null) {
            for (int i10 = 0; i10 < va.a.l(); i10++) {
                if (ma.d.h(va.a.n().get(i10).s())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void l0(ArrayList<LocalMedia> arrayList) {
        LocalMedia localMedia;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                localMedia = null;
                break;
            }
            localMedia = arrayList.get(i10);
            if (ma.d.h(arrayList.get(i10).s())) {
                break;
            } else {
                i10++;
            }
        }
        PictureSelectionConfig.N0.a(this, localMedia, arrayList, 69);
    }

    public boolean m() {
        if (PictureSelectionConfig.O0 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.f34945f.S;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (va.a.l() == 1) {
            String strO = va.a.o();
            boolean zH = ma.d.h(strO);
            if (zH && hashSet.contains(strO)) {
                return false;
            }
            return zH;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < va.a.l(); i11++) {
            LocalMedia localMedia = va.a.n().get(i11);
            if (ma.d.h(localMedia.s()) && hashSet.contains(localMedia.s())) {
                i10++;
            }
        }
        return i10 != va.a.l();
    }

    public void m0(boolean z10, String[] strArr) {
        ra.o oVar = PictureSelectionConfig.f34985e1;
        if (oVar != null) {
            if (!z10) {
                oVar.a(this);
            } else if (xa.a.h(K(), strArr)) {
                p.c(K(), strArr[0], false);
            } else {
                if (p.a(K(), strArr[0], false)) {
                    return;
                }
                PictureSelectionConfig.f34985e1.b(this, strArr);
            }
        }
    }

    public boolean n() {
        if (PictureSelectionConfig.L0 != null) {
            for (int i10 = 0; i10 < va.a.l(); i10++) {
                if (ma.d.h(va.a.n().get(i10).s())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void n0() {
        y();
        D();
        x();
        C();
        A();
        B();
        z();
    }

    public boolean o() {
        if (PictureSelectionConfig.N0 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        List<String> list = this.f34945f.S;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (va.a.l() == 1) {
            String strO = va.a.o();
            boolean zH = ma.d.h(strO);
            if (zH && hashSet.contains(strO)) {
                return false;
            }
            return zH;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < va.a.l(); i11++) {
            LocalMedia localMedia = va.a.n().get(i11);
            if (ma.d.h(localMedia.s()) && hashSet.contains(localMedia.s())) {
                i10++;
            }
        }
        return i10 != va.a.l();
    }

    public void o0(ArrayList<LocalMedia> arrayList) {
        if (r()) {
            M0(arrayList);
        } else if (p()) {
            v(arrayList);
        } else {
            V(arrayList);
            I(arrayList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        ForegroundService.stopService(K());
        if (i11 != -1) {
            if (i11 == 96) {
                Throwable thA = intent != null ? ma.a.a(intent) : new Throwable("image crop error");
                if (thA != null) {
                    r.c(K(), thA.getMessage());
                    return;
                }
                return;
            }
            if (i11 == 0) {
                if (i10 == 909) {
                    ab.j.b(K(), this.f34945f.f35000b0);
                    return;
                } else {
                    if (i10 == 1102) {
                        R(xa.b.f86887a);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i10 == 909) {
            G(intent);
            return;
        }
        if (i10 == 696) {
            c0(intent);
            return;
        }
        if (i10 == 69) {
            ArrayList<LocalMedia> arrayListN = va.a.n();
            try {
                if (arrayListN.size() == 1) {
                    LocalMedia localMedia = arrayListN.get(0);
                    Uri uriB = ma.a.b(intent);
                    localMedia.b0(uriB != null ? uriB.getPath() : "");
                    localMedia.a0(TextUtils.isEmpty(localMedia.m()) ? false : true);
                    localMedia.V(ma.a.h(intent));
                    localMedia.U(ma.a.e(intent));
                    localMedia.W(ma.a.f(intent));
                    localMedia.X(ma.a.g(intent));
                    localMedia.Y(ma.a.c(intent));
                    localMedia.Z(ma.a.d(intent));
                    localMedia.s0(localMedia.m());
                } else {
                    String stringExtra = intent.getStringExtra("output");
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = intent.getStringExtra("com.yalantis.ucrop.OutputUri");
                    }
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    if (jSONArray.length() == arrayListN.size()) {
                        for (int i12 = 0; i12 < arrayListN.size(); i12++) {
                            LocalMedia localMedia2 = arrayListN.get(i12);
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                            localMedia2.b0(jSONObjectOptJSONObject.optString("outPutPath"));
                            localMedia2.a0(!TextUtils.isEmpty(localMedia2.m()));
                            localMedia2.V(jSONObjectOptJSONObject.optInt("imageWidth"));
                            localMedia2.U(jSONObjectOptJSONObject.optInt("imageHeight"));
                            localMedia2.W(jSONObjectOptJSONObject.optInt("offsetX"));
                            localMedia2.X(jSONObjectOptJSONObject.optInt("offsetY"));
                            localMedia2.Y((float) jSONObjectOptJSONObject.optDouble("aspectRatio"));
                            localMedia2.Z(jSONObjectOptJSONObject.optString("customExtraData"));
                            localMedia2.s0(localMedia2.m());
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                r.c(K(), e10.getMessage());
            }
            ArrayList<LocalMedia> arrayList = new ArrayList<>(arrayListN);
            if (l()) {
                a0(arrayList);
            } else if (n()) {
                k0(arrayList);
            } else {
                o0(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        S();
        n0();
        super.onAttach(context);
        this.f34951l = context;
        if (getParentFragment() instanceof com.luck.picture.lib.basic.a) {
            this.f34942c = (com.luck.picture.lib.basic.a) getParentFragment();
        } else if (context instanceof com.luck.picture.lib.basic.a) {
            this.f34942c = (com.luck.picture.lib.basic.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        S();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        Animation animationLoadAnimation;
        PictureWindowAnimationStyle pictureWindowAnimationStyleE = PictureSelectionConfig.T0.e();
        if (z10) {
            animationLoadAnimation = pictureWindowAnimationStyleE.f35154b != 0 ? AnimationUtils.loadAnimation(K(), pictureWindowAnimationStyleE.f35154b) : AnimationUtils.loadAnimation(K(), R$anim.ps_anim_alpha_enter);
            D0(animationLoadAnimation.getDuration());
            d0();
        } else {
            animationLoadAnimation = pictureWindowAnimationStyleE.f35155c != 0 ? AnimationUtils.loadAnimation(K(), pictureWindowAnimationStyleE.f35155c) : AnimationUtils.loadAnimation(K(), R$anim.ps_anim_alpha_exit);
            e0();
        }
        return animationLoadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return N() != 0 ? layoutInflater.inflate(N(), viewGroup, false) : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        y0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (this.f34941b != null) {
            xa.a.b().j(iArr, this.f34941b);
            this.f34941b = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (pictureSelectionConfig != null) {
            bundle.putParcelable("com.luck.picture.lib.PictureSelectorConfig", pictureSelectionConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f34945f = (PictureSelectionConfig) bundle.getParcelable("com.luck.picture.lib.PictureSelectorConfig");
        }
        if (this.f34945f == null) {
            this.f34945f = PictureSelectionConfig.e();
        }
        la.c cVar = PictureSelectionConfig.f34991k1;
        if (cVar != null) {
            cVar.a(this, view, bundle);
        }
        ra.f fVar = PictureSelectionConfig.f34996p1;
        if (fVar != null) {
            this.f34946g = fVar.create(K());
        } else {
            this.f34946g = new na.c(K());
        }
        ab.h.c(requireContext());
        F0();
        H0();
        G0(requireView());
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        if (!pictureSelectionConfig.N || pictureSelectionConfig.f35001c) {
            return;
        }
        SoundPool soundPool = new SoundPool(1, 3, 0);
        this.f34947h = soundPool;
        this.f34948i = soundPool.load(K(), R$raw.ps_click_music, 1);
    }

    public boolean p() {
        return ab.l.e() && PictureSelectionConfig.P0 != null;
    }

    public final void p0(LocalMedia localMedia) {
        if (ab.a.c(getActivity())) {
            return;
        }
        if (ab.l.e()) {
            if (ma.d.i(localMedia.s()) && ma.d.c(this.f34945f.f35000b0)) {
                new la.g(getActivity(), localMedia.y());
                return;
            }
            return;
        }
        String strY = ma.d.c(this.f34945f.f35000b0) ? localMedia.y() : this.f34945f.f35000b0;
        new la.g(getActivity(), strY);
        if (ma.d.h(localMedia.s())) {
            int iE = ab.j.e(K(), new File(strY).getParent());
            if (iE != -1) {
                ab.j.o(K(), iE);
            }
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    public boolean q(LocalMedia localMedia, boolean z10, String str, String str2, long j10, long j11) {
        if (!ma.d.k(str2, str)) {
            e0 e0Var = PictureSelectionConfig.V0;
            if (e0Var != null && e0Var.a(K(), localMedia, this.f34945f, 3)) {
                return true;
            }
            J0(getString(R$string.ps_rule));
            return true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        long j12 = pictureSelectionConfig.A;
        if (j12 > 0 && j10 > j12) {
            e0 e0Var2 = PictureSelectionConfig.V0;
            if (e0Var2 != null && e0Var2.a(K(), localMedia, this.f34945f, 1)) {
                return true;
            }
            J0(getString(R$string.ps_select_max_size, ab.k.f(this.f34945f.A)));
            return true;
        }
        long j13 = pictureSelectionConfig.B;
        if (j13 > 0 && j10 < j13) {
            e0 e0Var3 = PictureSelectionConfig.V0;
            if (e0Var3 != null && e0Var3.a(K(), localMedia, this.f34945f, 2)) {
                return true;
            }
            J0(getString(R$string.ps_select_min_size, ab.k.f(this.f34945f.B)));
            return true;
        }
        if (ma.d.i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f34945f;
            if (pictureSelectionConfig2.f35017k == 2) {
                int i10 = pictureSelectionConfig2.f35023n;
                if (i10 <= 0) {
                    i10 = pictureSelectionConfig2.f35019l;
                }
                pictureSelectionConfig2.f35023n = i10;
                if (!z10 && va.a.l() >= this.f34945f.f35023n) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), localMedia, this.f34945f, 6)) {
                        return true;
                    }
                    J0(P(K(), str, this.f34945f.f35023n));
                    return true;
                }
            }
            if (!z10 && this.f34945f.f35037u > 0 && ab.d.i(j11) < this.f34945f.f35037u) {
                e0 e0Var5 = PictureSelectionConfig.V0;
                if (e0Var5 != null && e0Var5.a(K(), localMedia, this.f34945f, 9)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_min_second, Integer.valueOf(this.f34945f.f35037u / 1000)));
                return true;
            }
            if (!z10 && this.f34945f.f35035t > 0 && ab.d.i(j11) > this.f34945f.f35035t) {
                e0 e0Var6 = PictureSelectionConfig.V0;
                if (e0Var6 != null && e0Var6.a(K(), localMedia, this.f34945f, 8)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_max_second, Integer.valueOf(this.f34945f.f35035t / 1000)));
                return true;
            }
        } else if (ma.d.d(str)) {
            if (this.f34945f.f35017k == 2 && !z10 && va.a.n().size() >= this.f34945f.f35019l) {
                e0 e0Var7 = PictureSelectionConfig.V0;
                if (e0Var7 != null && e0Var7.a(K(), localMedia, this.f34945f, 4)) {
                    return true;
                }
                J0(P(K(), str, this.f34945f.f35019l));
                return true;
            }
            if (!z10 && this.f34945f.f35037u > 0 && ab.d.i(j11) < this.f34945f.f35037u) {
                e0 e0Var8 = PictureSelectionConfig.V0;
                if (e0Var8 != null && e0Var8.a(K(), localMedia, this.f34945f, 11)) {
                    return true;
                }
                J0(getString(R$string.ps_select_audio_min_second, Integer.valueOf(this.f34945f.f35037u / 1000)));
                return true;
            }
            if (!z10 && this.f34945f.f35035t > 0 && ab.d.i(j11) > this.f34945f.f35035t) {
                e0 e0Var9 = PictureSelectionConfig.V0;
                if (e0Var9 != null && e0Var9.a(K(), localMedia, this.f34945f, 10)) {
                    return true;
                }
                J0(getString(R$string.ps_select_audio_max_second, Integer.valueOf(this.f34945f.f35035t / 1000)));
                return true;
            }
        } else if (this.f34945f.f35017k == 2 && !z10 && va.a.n().size() >= this.f34945f.f35019l) {
            e0 e0Var10 = PictureSelectionConfig.V0;
            if (e0Var10 != null && e0Var10.a(K(), localMedia, this.f34945f, 4)) {
                return true;
            }
            J0(P(K(), str, this.f34945f.f35019l));
            return true;
        }
        return false;
    }

    public void q0(int i10, ArrayList<LocalMedia> arrayList) {
        if (this.f34942c != null) {
            this.f34942c.a(O(i10, arrayList));
        }
    }

    public boolean r() {
        return ab.l.e() && PictureSelectionConfig.Q0 != null;
    }

    public void r0(boolean z10, LocalMedia localMedia) {
    }

    public boolean s() {
        return PictureSelectionConfig.f34990j1 != null;
    }

    public void s0() {
        PhotoItemSelectedDialog photoItemSelectedDialogD = PhotoItemSelectedDialog.d();
        photoItemSelectedDialogD.f(new h());
        photoItemSelectedDialogD.e(new i());
        photoItemSelectedDialogD.show(getChildFragmentManager(), "PhotoItemSelectedDialog");
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    public boolean t(LocalMedia localMedia, boolean z10, String str, int i10, long j10, long j11) {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        long j12 = pictureSelectionConfig.A;
        if (j12 > 0 && j10 > j12) {
            e0 e0Var = PictureSelectionConfig.V0;
            if (e0Var != null && e0Var.a(K(), localMedia, this.f34945f, 1)) {
                return true;
            }
            J0(getString(R$string.ps_select_max_size, ab.k.f(this.f34945f.A)));
            return true;
        }
        long j13 = pictureSelectionConfig.B;
        if (j13 > 0 && j10 < j13) {
            e0 e0Var2 = PictureSelectionConfig.V0;
            if (e0Var2 != null && e0Var2.a(K(), localMedia, this.f34945f, 2)) {
                return true;
            }
            J0(getString(R$string.ps_select_min_size, ab.k.f(this.f34945f.B)));
            return true;
        }
        if (ma.d.i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f34945f;
            if (pictureSelectionConfig2.f35017k == 2) {
                if (pictureSelectionConfig2.f35023n <= 0) {
                    e0 e0Var3 = PictureSelectionConfig.V0;
                    if (e0Var3 != null && e0Var3.a(K(), localMedia, this.f34945f, 3)) {
                        return true;
                    }
                    J0(getString(R$string.ps_rule));
                    return true;
                }
                if (!z10 && va.a.n().size() >= this.f34945f.f35019l) {
                    e0 e0Var4 = PictureSelectionConfig.V0;
                    if (e0Var4 != null && e0Var4.a(K(), localMedia, this.f34945f, 4)) {
                        return true;
                    }
                    J0(getString(R$string.ps_message_max_num, Integer.valueOf(this.f34945f.f35019l)));
                    return true;
                }
                if (!z10 && i10 >= this.f34945f.f35023n) {
                    e0 e0Var5 = PictureSelectionConfig.V0;
                    if (e0Var5 != null && e0Var5.a(K(), localMedia, this.f34945f, 6)) {
                        return true;
                    }
                    J0(P(K(), str, this.f34945f.f35023n));
                    return true;
                }
            }
            if (!z10 && this.f34945f.f35037u > 0 && ab.d.i(j11) < this.f34945f.f35037u) {
                e0 e0Var6 = PictureSelectionConfig.V0;
                if (e0Var6 != null && e0Var6.a(K(), localMedia, this.f34945f, 9)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_min_second, Integer.valueOf(this.f34945f.f35037u / 1000)));
                return true;
            }
            if (!z10 && this.f34945f.f35035t > 0 && ab.d.i(j11) > this.f34945f.f35035t) {
                e0 e0Var7 = PictureSelectionConfig.V0;
                if (e0Var7 != null && e0Var7.a(K(), localMedia, this.f34945f, 8)) {
                    return true;
                }
                J0(getString(R$string.ps_select_video_max_second, Integer.valueOf(this.f34945f.f35035t / 1000)));
                return true;
            }
        } else if (this.f34945f.f35017k == 2 && !z10 && va.a.n().size() >= this.f34945f.f35019l) {
            e0 e0Var8 = PictureSelectionConfig.V0;
            if (e0Var8 != null && e0Var8.a(K(), localMedia, this.f34945f, 4)) {
                return true;
            }
            J0(getString(R$string.ps_message_max_num, Integer.valueOf(this.f34945f.f35019l)));
            return true;
        }
        return false;
    }

    public void t0() {
        String[] strArr = xa.b.f86888b;
        m0(true, strArr);
        if (PictureSelectionConfig.f34981a1 != null) {
            W(ma.c.f74023a, strArr);
        } else {
            xa.a.b().requestPermissions(this, strArr, new j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int u(LocalMedia localMedia, boolean z10) {
        d0 d0Var = PictureSelectionConfig.f34984d1;
        int i10 = 0;
        if (d0Var != null && d0Var.a(localMedia)) {
            e0 e0Var = PictureSelectionConfig.V0;
            if (!(e0Var != null ? e0Var.a(K(), localMedia, this.f34945f, 13) : false)) {
                r.c(K(), getString(R$string.ps_select_no_support));
            }
            return -1;
        }
        if (T(localMedia, z10) != 200) {
            return -1;
        }
        ArrayList<LocalMedia> arrayListN = va.a.n();
        if (z10) {
            arrayListN.remove(localMedia);
            i10 = 1;
        } else {
            if (this.f34945f.f35017k == 1 && arrayListN.size() > 0) {
                A0(arrayListN.get(0));
                arrayListN.clear();
            }
            arrayListN.add(localMedia);
            localMedia.l0(arrayListN.size());
            x0();
        }
        B0(i10 ^ 1, localMedia);
        return i10;
    }

    public void u0() {
        PictureSelectionConfig pictureSelectionConfig = this.f34945f;
        int i10 = pictureSelectionConfig.f34999b;
        if (i10 == 0) {
            if (pictureSelectionConfig.f35026o0 == ma.e.c()) {
                t0();
                return;
            } else if (this.f34945f.f35026o0 == ma.e.d()) {
                w0();
                return;
            } else {
                s0();
                return;
            }
        }
        if (i10 == 1) {
            t0();
        } else if (i10 == 2) {
            w0();
        } else {
            if (i10 != 3) {
                return;
            }
            v0();
        }
    }

    @Deprecated
    public final void v(ArrayList<LocalMedia> arrayList) {
        I0();
        PictureThreadUtils.h(new e(arrayList));
    }

    public void v0() {
        if (PictureSelectionConfig.f34987g1 != null) {
            ForegroundService.c(K());
            PictureSelectionConfig.f34987g1.a(this, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE);
        } else {
            throw new NullPointerException(w.class.getSimpleName() + " interface needs to be implemented for recording");
        }
    }

    public final void w() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f34945f.Y) || !ma.d.c(this.f34945f.f35000b0)) {
                return;
            }
            InputStream inputStreamA = la.e.a(K(), Uri.parse(this.f34945f.f35000b0));
            if (TextUtils.isEmpty(this.f34945f.W)) {
                str = "";
            } else {
                PictureSelectionConfig pictureSelectionConfig = this.f34945f;
                if (pictureSelectionConfig.f35001c) {
                    str = pictureSelectionConfig.W;
                } else {
                    str = System.currentTimeMillis() + "_" + this.f34945f.W;
                }
            }
            Context contextK = K();
            PictureSelectionConfig pictureSelectionConfig2 = this.f34945f;
            File fileB = ab.k.b(contextK, pictureSelectionConfig2.f34999b, str, "", pictureSelectionConfig2.Y);
            if (ab.k.q(inputStreamA, new FileOutputStream(fileB.getAbsolutePath()))) {
                ab.j.b(K(), this.f34945f.f35000b0);
                this.f34945f.f35000b0 = fileB.getAbsolutePath();
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    public void w0() {
        String[] strArr = xa.b.f86888b;
        m0(true, strArr);
        if (PictureSelectionConfig.f34981a1 != null) {
            W(ma.c.f74024b, strArr);
        } else {
            xa.a.b().requestPermissions(this, strArr, new k());
        }
    }

    public final void x() {
        oa.h hVarA;
        oa.h hVarA2;
        if (PictureSelectionConfig.e().f35038u0) {
            if (PictureSelectionConfig.M0 == null && (hVarA2 = ka.b.c().a()) != null) {
                PictureSelectionConfig.M0 = hVarA2.f();
            }
            if (PictureSelectionConfig.L0 != null || (hVarA = ka.b.c().a()) == null) {
                return;
            }
            PictureSelectionConfig.L0 = hVarA.g();
        }
    }

    public final void x0() {
        SoundPool soundPool = this.f34947h;
        if (soundPool == null || !this.f34945f.N) {
            return;
        }
        soundPool.play(this.f34948i, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    public final void y() {
        oa.h hVarA;
        if (PictureSelectionConfig.K0 != null || (hVarA = ka.b.c().a()) == null) {
            return;
        }
        PictureSelectionConfig.K0 = hVarA.i();
    }

    public final void y0() {
        try {
            SoundPool soundPool = this.f34947h;
            if (soundPool != null) {
                soundPool.release();
                this.f34947h = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void z() {
        oa.h hVarA;
        if (PictureSelectionConfig.e().f35034s0 && PictureSelectionConfig.f34982b1 == null && (hVarA = ka.b.c().a()) != null) {
            PictureSelectionConfig.f34982b1 = hVarA.c();
        }
    }

    public void z0(boolean z10) {
    }
}
