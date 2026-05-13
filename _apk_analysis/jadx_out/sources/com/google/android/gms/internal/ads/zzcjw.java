package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private zzdxz zzA;

    @Nullable
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;

    @Nullable
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    public final zzcjl zza;

    @Nullable
    public zzcce zzb;

    @Nullable
    private final zzbgd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;

    @Nullable
    private zzbww zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgG)).split(StringUtils.COMMA)));

    @VisibleForTesting
    public zzcjw(zzcjl zzcjlVar, @Nullable zzbgd zzbgdVar, boolean z10, zzbww zzbwwVar, @Nullable zzbwr zzbwrVar, @Nullable zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z10;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(final View view, final zzcce zzcceVar, final int i10) {
        if (!zzcceVar.zzc() || i10 <= 0) {
            return;
        }
        zzcceVar.zzd(view);
        if (zzcceVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(view, zzcceVar, i10);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Nullable
    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        r10 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0135, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0137, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        if (r0.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013f, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        if (r1 >= r0.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
    
        if (r0[r1].trim().startsWith(com.ironsource.G5.M) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015e, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0160, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0167, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016a, code lost:
    
        r0 = r7.getHeaderFields();
        r14 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0183, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018f, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
    
        r14.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b9, code lost:
    
        r10 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r10, r11, com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionGetResponseCode(r7), r7.getResponseMessage(), r14, com.safedk.android.internal.partials.AdMobNetworkBridge.urlConnectionGetInputStream(r7));
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzaf(java.lang.String r17, java.util.Map r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjw.zzaf(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z10, long j10) {
        this.zza.zzu(z10, j10);
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        return zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z10, zzcjl zzcjlVar) {
        return (!z10 || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53134h, webView, str);
        safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53134h, webView, str);
        safedk_zzcjw_onPageFinished_2f8a035cbeaffdb9df79440b33ea614a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    public void safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    public void safedk_zzcjw_onPageFinished_2f8a035cbeaffdb9df79440b33ea614a(WebView webView, String str) {
        synchronized (this.zzf) {
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzcjlVar.zzY();
                return;
            }
            this.zzC = true;
            zzcli zzcliVar = this.zzj;
            if (zzcliVar != null) {
                zzcliVar.zza();
                this.zzj = null;
            }
            zzu();
            zzcjl zzcjlVar2 = this.zza;
            if (zzcjlVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue()) {
                    zzcjlVar2.zzL().zzz(str);
                }
            }
        }
    }

    @Nullable
    public WebResourceResponse safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(WebView webView, String str) {
        return zzL(str, Collections.emptyMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzazh zzazhVarZzS = zzcjlVar.zzS();
                    zzfjo zzfjoVarZzT = zzcjlVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVarZzT == null) {
                        if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                            uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                        }
                    } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                        uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                    }
                } catch (zzazi unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcjlVar2 != null ? zzcjlVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53134h, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53134h, webView, str, safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3 = safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f53134h, webView, str, zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3);
        return zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zZzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            HashMap map = this.zze;
            List copyOnWriteArrayList = (List) map.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                map.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbohVar);
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbohVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzboh> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzboh zzbohVar : list) {
                if (predicate.apply(zzbohVar)) {
                    arrayList.add(zzbohVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbwr zzbwrVar = this.zzz;
            if (zzbwrVar != null) {
                zzbwrVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzdxz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzczz zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9 A[Catch: all -> 0x01df, TryCatch #11 {all -> 0x01df, blocks: (B:59:0x0189, B:61:0x019b, B:62:0x01a3, B:71:0x01e7, B:73:0x01f9, B:74:0x0200), top: B:105:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bc A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:63:0x01ae, B:43:0x016e, B:88:0x02bc, B:76:0x0236, B:77:0x0269, B:75:0x0204, B:42:0x013d, B:27:0x00d1, B:78:0x026a, B:80:0x0274, B:82:0x027a, B:84:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1 A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:63:0x01ae, B:43:0x016e, B:88:0x02bc, B:76:0x0236, B:77:0x0269, B:75:0x0204, B:42:0x013d, B:27:0x00d1, B:78:0x026a, B:80:0x0274, B:82:0x027a, B:84:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzL(java.lang.String r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjw.zzL(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzM(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl zzcjlVar = this.zza.zza;
                    zzcjlVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcjlVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z10) {
        this.zzF = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzP(int i10, int i11) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i10, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzQ(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhF)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i10 = zzcjw.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgH)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgzo.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzR(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzS(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzT(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i10) {
        zzac(view, zzcceVar, i10 - 1);
    }

    public final /* synthetic */ void zzV(boolean z10, long j10) {
        zzY(true, j10);
    }

    public final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i10) {
        zzac(view, zzcceVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zza(int i10, int i11, boolean z10) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i10, i11);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzab(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbmx zzbmxVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbmz zzbmzVar, @Nullable com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z10, @Nullable zzbok zzbokVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbwy zzbwyVar, @Nullable zzcce zzcceVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar, @Nullable zzdxz zzdxzVar, @Nullable zzbpc zzbpcVar, @Nullable zzdjm zzdjmVar, @Nullable zzbpb zzbpbVar, @Nullable zzbov zzbovVar, @Nullable zzboi zzboiVar, @Nullable zzcrv zzcrvVar, @Nullable zzdzc zzdzcVar, @Nullable zzdae zzdaeVar, @Nullable zzczz zzczzVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcceVar, null) : zzbVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(zzbVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbou(zzbVar2, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map map = new HashMap();
            if (zzcjlVar.zzC() != null) {
                map = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), map));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzd(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zze(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzi(@Nullable com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final boolean zzk() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzn() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcjl zzcjlVar = this.zza;
            WebView webViewZzD = zzcjlVar.zzD();
            if (ViewCompat.isAttachedToWindow(webViewZzD)) {
                zzac(webViewZzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            ((View) zzcjlVar).addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            zzclh zzclhVar = this.zzi;
            boolean z10 = false;
            if (!this.zzD && !this.zzo) {
                z10 = true;
            }
            zzclhVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean z12 = zzaj(zZzW, zzcjlVar) || z11;
        zzA(new AdOverlayInfoParcel(zzcVar, z12 ? null : this.zzg, zZzW ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z12 || !z10 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i10) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    public final void zzx(boolean z10, int i10, boolean z11) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z12 = true;
        if (!zZzaj && z11) {
            z12 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, this.zzh, this.zzw, zzcjlVar, z10, i10, zzcjlVar.zzs(), z12 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }

    public final void zzy(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z13 = true;
        if (!zZzaj && z11) {
            z13 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, zZzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z10, i10, str, zzcjlVar.zzs(), z13 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null, z12));
    }

    public final void zzz(boolean z10, int i10, String str, String str2, boolean z11) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z12 = true;
        if (!zZzaj && z11) {
            z12 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, zZzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z10, i10, str, str2, zzcjlVar.zzs(), z12 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }
}
