package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
class C4233r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33412a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33413b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33414c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33415d = "getAdapterVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33416e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.r9$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33417a;

        public a(Context context) {
            this.f33417a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C4233r9.f33412a, "--------------- Google Play Services --------------");
                if (this.f33417a.getPackageManager().getApplicationInfo(this.f33417a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i(C4233r9.f33412a, "Google Play Services - VERIFIED");
                    String strB = com.ironsource.mediationsdk.r.m().b(this.f33417a);
                    if (!TextUtils.isEmpty(strB)) {
                        Log.i(C4233r9.f33412a, "GAID is: " + strB + " (use this for test devices)");
                    }
                } else {
                    Log.e(C4233r9.f33412a, "Google Play Services - MISSING");
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                Log.e(C4233r9.f33412a, "Google Play Services - MISSING");
            }
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
            Log.i(f33412a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f33415d : "getVersion", null).invoke(obj, null)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Log.w(f33412a, "Unable to get adapter version");
        }
    }

    private static boolean a(Context context, String str) {
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            byte b10 = -1;
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b10 = 0;
                    }
                } else if (lowerCase.equals("admob")) {
                    b10 = 1;
                }
            } else if (lowerCase.equals("vungle")) {
                b10 = 2;
            }
            if (b10 == 0) {
                Log.i(f33412a, "--------------- Meta --------------");
            } else if (b10 == 1) {
                Log.i(f33412a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b10 != 2) {
                Log.i(f33412a, "--------------- " + str + " --------------");
            } else {
                Log.i(f33412a, "--------------- Liftoff Monetization --------------");
            }
            try {
                Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                try {
                    objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                } catch (NoSuchMethodException unused) {
                    objNewInstance = cls.getConstructor(null).newInstance(null);
                }
                b(objNewInstance);
                a(objNewInstance);
                return true;
            } catch (ClassNotFoundException e10) {
                C4228r4.d().a(e10);
                Log.e(f33412a, "Adapter - MISSING");
                return false;
            } catch (Exception e11) {
                C4228r4.d().a(e11);
                Log.e(f33412a, "Failed to instantiate adapter");
                return false;
            }
        } catch (Exception e12) {
            C4228r4.d().a(e12);
            Log.e(f33412a, "isAdapterValid " + str, e12);
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void b(Context context) {
        Log.i(f33412a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", "APS", BidMachine.NAME, "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", Q6.H1, "Verve", "Yandex", "YSO"};
        for (int i10 = 0; i10 < 26; i10++) {
            String str = strArr[i10];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f33412a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f33412a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f33412a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f33412a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals("facebook")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                    */
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4233r9.b(android.content.Context):void");
            }

            private static void b(Object obj) {
                try {
                    Log.i(f33412a, "SDK Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f33413b : f33414c, null).invoke(obj, null)));
                } catch (Exception e10) {
                    C4228r4.d().a(e10);
                    Log.w(f33412a, "Unable to get SDK version");
                }
            }

            private static void c(Context context) {
                Log.i(f33412a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(f33412a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(f33412a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(f33412a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(f33412a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }
        }
