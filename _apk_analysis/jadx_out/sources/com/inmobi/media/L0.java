package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.L0;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f25831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f25832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f25836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdQualityControl f25837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Hn f25838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f25839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f25841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f25842l;

    public L0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(adQualityConfig, "adQualityConfig");
        this.f25831a = adQualityConfig;
        this.f25832b = interfaceC3580m9;
        this.f25833c = new AtomicBoolean(false);
        this.f25834d = new AtomicBoolean(false);
        this.f25835e = new AtomicBoolean(false);
        this.f25836f = new CopyOnWriteArrayList();
        this.f25838h = Hn.f25624a;
        this.f25840j = "";
        this.f25841k = new JSONObject();
        this.f25842l = new AtomicBoolean(false);
    }

    public static final void a(L0 l02, Activity activity, long j10, boolean z10, Qh qh2) {
        l02.a("activity is visible");
        Window window = activity.getWindow();
        tn.p.j(window, "getWindow(...)");
        tn.p.k(window, "window");
        l02.a(new C3687qg(window, l02.f25831a), j10, z10, qh2);
        l02.f25842l.set(!z10);
    }

    public static final void a(L0 l02, View view, long j10, boolean z10, Qh qh2) {
        l02.getClass();
        tn.p.k(view, "adView");
        l02.a(new Hi(view, l02.f25831a), j10, z10, qh2);
        l02.f25842l.set(!z10);
    }

    public static final boolean a(L0 l02) {
        return l02.f25838h == Hn.f25626c;
    }

    public final void a(final Activity activity, final long j10, final boolean z10, final Qh qh2) {
        a("isCapture started - " + this.f25842l.get() + ", isReporting - " + z10);
        if (!this.f25842l.get() || z10) {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: n9.o2
                @Override // java.lang.Runnable
                public final void run() {
                    L0.a(this.f75537b, activity, j10, z10, qh2);
                }
            });
        } else {
            a("Screenshot process already in progress... skipping...", (Exception) null);
        }
    }

    public final void a(Activity activity, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(str, "url");
        tn.p.k(jSONObject, "extras");
        tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (jSONObject.length() <= 0 || str.length() <= 0) {
            qh2.f26187a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
            return;
        }
        this.f25840j = str;
        this.f25841k = jSONObject;
        a("report ad starting");
        if (z10) {
            a("report ad capture");
            a(activity, 0L, true, qh2);
        } else {
            a("report ad report");
            a(new AdQualityResult("", null, str, jSONObject.toString()), false);
        }
    }

    public final void a(Bitmap bitmap, M0 m02, boolean z10, Qh qh2) {
        String beacon;
        tn.p.k(m02, "process");
        a("Screen shot result received - isReporting - " + z10);
        this.f25836f.remove(m02);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && qh2 != null) {
            qh2.f26187a.g("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (z10) {
            String str = this.f25840j;
            tn.p.h(byteArray);
            a(str, byteArray, true);
        } else {
            AdQualityControl adQualityControl = this.f25837g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                a("saving to file - beacon - " + beacon);
                tn.p.h(byteArray);
                a(beacon, byteArray, false);
            }
        }
        this.f25842l.set(false);
    }

    public final void a(AdQualityResult adQualityResult, boolean z10) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            a("beacon is empty");
        } else {
            AbstractC3369e.a(new C3563lh(adQualityResult), new I0(this, z10), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                  (wrap:com.inmobi.media.lh:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] call: com.inmobi.media.lh.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                  (wrap:com.inmobi.media.I0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z10' boolean) A[MD:(com.inmobi.media.L0, boolean):void (m), WRAPPED] call: com.inmobi.media.I0.<init>(com.inmobi.media.L0, boolean):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap:sn.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: n9.p6.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, sn.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, sn.a):void (m)] in method: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes8.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: n9.p6, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 41 more
                */
            /*
                this = this;
                java.lang.String r0 = r2.getBeaconUrl()
                int r0 = r0.length()
                if (r0 != 0) goto L10
                java.lang.String r2 = "beacon is empty"
                r1.a(r2)
                return
            L10:
                com.inmobi.media.lh r0 = new com.inmobi.media.lh
                r0.<init>(r2)
                com.inmobi.media.I0 r2 = new com.inmobi.media.I0
                r2.<init>(r1, r3)
                com.inmobi.media.AbstractC3369e.a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
        }

        public final void a(final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, final long j10, final boolean z10, final Qh qh2) {
            a("isCapture started - " + this.f25842l.get() + ", isReporting - " + z10);
            if (!this.f25842l.get() || z10) {
                gestureDetectorOnGestureListenerC3337ci.post(new Runnable() { // from class: n9.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        L0.a(this.f75563b, gestureDetectorOnGestureListenerC3337ci, j10, z10, qh2);
                    }
                });
            } else {
                a("Screenshot process already in progress... skipping...", (Exception) null);
            }
        }

        public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
            tn.p.k(gestureDetectorOnGestureListenerC3337ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            tn.p.k(str, "url");
            tn.p.k(jSONObject, "extras");
            tn.p.k(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (jSONObject.length() > 0 && str.length() > 0) {
                this.f25840j = str;
                this.f25841k = jSONObject;
                if (z10) {
                    a(gestureDetectorOnGestureListenerC3337ci, 0L, true, qh2);
                    return;
                } else {
                    a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                    return;
                }
            }
            qh2.f26187a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
        }

        public final void a(AbstractC3747t2 abstractC3747t2, long j10, boolean z10, Qh qh2) {
            if (!z10) {
                this.f25836f.add(abstractC3747t2);
            }
            AbstractC3369e.a(abstractC3747t2, new K0(this, abstractC3747t2, z10, qh2), Long.valueOf(j10), new sn.a() { // from class: n9.n2
                @Override // sn.a
                public final Object invoke() {
                    return Boolean.valueOf(L0.a(this.f75518b));
                }
            });
        }

        public final void a(Exception exc, M0 m02) {
            tn.p.k(m02, "process");
            a("error in running process - " + m02.getClass().getSimpleName(), exc);
            this.f25836f.remove(m02);
            a(true);
        }

        public final void a(String str) {
            InterfaceC3580m9 interfaceC3580m9 = this.f25832b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("AdQualityManager", str);
            }
        }

        public final void a(String str, M0 m02, String str2, boolean z10) {
            tn.p.k(str, "result");
            tn.p.k(m02, "process");
            tn.p.k(str2, "beacon");
            if (z10) {
                a(new AdQualityResult(str, null, str2, this.f25841k.toString()), false);
                return;
            }
            this.f25836f.remove(m02);
            AdQualityResult adQualityResult = this.f25839i;
            if (adQualityResult != null) {
                adQualityResult.setImageLocation(str);
            } else {
                this.f25839i = new AdQualityResult(str, null, str2, null, 8, null);
            }
            a("file is saved. result - " + this.f25839i);
            a(true);
        }

        public final void a(String str, Exception exc) {
            bn.r rVar;
            if (exc != null) {
                InterfaceC3580m9 interfaceC3580m9 = this.f25832b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a("AdQualityManager", str, exc);
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    return;
                }
            }
            InterfaceC3580m9 interfaceC3580m92 = this.f25832b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).b("AdQualityManager", "Error with null exception : " + str);
                bn.r rVar2 = bn.r.f5635a;
            }
        }

        public final void a(String str, byte[] bArr, boolean z10) {
            Context context = Ji.f25747a;
            if (context != null) {
                Ej ej2 = new Ej(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
                if (!z10) {
                    this.f25836f.add(ej2);
                }
                AbstractC3369e.a(ej2, new J0(this, z10, ej2, str), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE 
                      (r1v1 'ej2' com.inmobi.media.Ej)
                      (wrap:com.inmobi.media.J0:0x002b: CONSTRUCTOR 
                      (r2v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS])
                      (r5v0 'z10' boolean)
                      (r1v1 'ej2' com.inmobi.media.Ej)
                      (r3v0 'str' java.lang.String)
                     A[MD:(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void (m), WRAPPED] call: com.inmobi.media.J0.<init>(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap:sn.a:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: n9.p6.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, sn.a):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, sn.a):void (m)] in method: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: n9.p6, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 43 more
                    */
                /*
                    this = this;
                    android.content.Context r0 = com.inmobi.media.Ji.f25747a
                    if (r0 == 0) goto L31
                    java.io.File r0 = r0.getFilesDir()
                    java.lang.String r0 = r0.getAbsolutePath()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    java.lang.String r0 = "/adQuality/screenshots"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.inmobi.media.Ej r1 = new com.inmobi.media.Ej
                    r1.<init>(r0, r4)
                    if (r5 != 0) goto L29
                    java.util.concurrent.CopyOnWriteArrayList r4 = r2.f25836f
                    r4.add(r1)
                L29:
                    com.inmobi.media.J0 r4 = new com.inmobi.media.J0
                    r4.<init>(r2, r5, r1, r3)
                    com.inmobi.media.AbstractC3369e.a(r1, r4)
                L31:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void");
            }

            public final void a(boolean z10) {
                String beacon;
                AdQualityControl adQualityControl = this.f25837g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f25836f.isEmpty() && this.f25834d.get() && !this.f25835e.get()) {
                    this.f25835e.set(true);
                    a("session end - queuing result");
                    AdQualityResult adQualityResult = this.f25839i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (!this.f25834d.get() || z10 || this.f25835e.get()) {
                    this.f25836f.size();
                    this.f25834d.get();
                    Objects.toString(this.f25835e);
                    return;
                }
                this.f25835e.set(true);
                a("session stop - queuing result");
                p000do.l0 l0Var = E0.f25356e;
                if (l0Var != null) {
                    kotlinx.coroutines.d.d(l0Var, new CancellationException("Shutdown"));
                }
                E0.f25356e = null;
                AdQualityResult adQualityResult2 = this.f25839i;
                if (adQualityResult2 == null) {
                    adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
                }
                a(adQualityResult2, true);
            }

            public final boolean a() {
                if (this.f25833c.get()) {
                    a("ad quality session is already in progress. skipping...");
                    return false;
                }
                if (!this.f25831a.getEnabled()) {
                    a("config kill switch while state check - false. ad quality will skip");
                    return false;
                }
                if (this.f25837g == null) {
                    a("setup not done. skipping");
                    return false;
                }
                Hn hn2 = this.f25838h;
                if (hn2 != Hn.f25624a && hn2 != Hn.f25625b) {
                    return true;
                }
                a("ad view is not visible. skipping");
                return false;
            }
        }
