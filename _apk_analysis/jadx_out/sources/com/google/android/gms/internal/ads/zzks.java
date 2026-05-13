package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;

    @Nullable
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;

    @Nullable
    private Object zzN;

    @Nullable
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    public final zzaak zzb;
    public final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzks(zzjf zzjfVar, @Nullable zzbb zzbbVar) {
        zzjf zzjfVar2;
        zzdn zzdnVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb2.append(str);
            sb2.append(C3978d4.j.f31385e);
            zzee.zzb("ExoPlayerImpl", sb2.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zzmlVarArrZza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzmlVarArrZza;
            int length = zzmlVarArrZza.length;
            this.zzi = new zzml[2];
            int i10 = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i10];
                zzmlVarArr[i10] = null;
                i10++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar2 = zzjfVar.zzb;
            this.zzv = zzdnVar2;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar2, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar2.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    this.zza.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar2, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper looperZzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i11 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                final Context context = this.zzf;
                zzjfVar2 = zzjfVar;
                final boolean z10 = zzjfVar2.zzv;
                zzdnVar = zzdnVar2;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zzpmVarZza = zzpm.zza(context);
                        if (zzpmVarZza == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z10) {
                            this.zzD(zzpmVarZza);
                        }
                        zzpqVar.zzb(zzpmVarZza.zzb());
                    }
                });
            } else {
                zzjfVar2 = zzjfVar;
                zzdnVar = zzdnVar2;
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjfVar2.zza, looperZzn, zzjfVar2.zzi, this.zzw, zzdnVar);
            boolean z11 = (zzjfVar2.zzs == Integer.MAX_VALUE || zzjfVar2.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar2.zza, looperZzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z11);
            this.zzz = new zzfp(zzjfVar2.zza, looperZzn, zzdnVar);
            int i13 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = i12 >= 34 ? new zzkr(this, zzjfVar2.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar2.zzr, zzjfVar2.zzs, zzjfVar2.zzt, zzjfVar2.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
        } finally {
            this.zze.zza();
        }
    }

    public static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(@Nullable zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzmdVarZzh = zzmdVar.zzh(zzmdVar.zzb);
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        zzmdVarZzh.zzr = 0L;
        zzmd zzmdVarZzao = zzao(zzmdVarZzh, 1);
        if (zziwVar != null) {
            zzmdVarZzao = zzmdVarZzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzmdVarZzao, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j10 = zzmdVar.zzc;
        if (j10 != -9223372036854775807L) {
            return zzfj.zzp(0L) + zzfj.zzp(j10);
        }
        long j11 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
        return zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        long j10 = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j10;
        }
        zzaq(zzbfVar, zzwkVar, j10);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027c  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzaw] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzmd r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzal(com.google.android.gms.internal.ads.zzmd, int, boolean, int, long, int, boolean):void");
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j10 = zzmdVar.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzmd zzan(com.google.android.gms.internal.ads.zzmd r23, com.google.android.gms.internal.ads.zzbf r24, @androidx.annotation.Nullable android.util.Pair r25) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzan(com.google.android.gms.internal.ads.zzmd, com.google.android.gms.internal.ads.zzbf, android.util.Pair):com.google.android.gms.internal.ads.zzmd");
    }

    private static zzmd zzao(zzmd zzmdVar, int i10) {
        zzmd zzmdVarZze = zzmdVar.zze(i10);
        return (i10 == 1 || i10 == 4) ? zzmdVarZze.zzg(false) : zzmdVarZze;
    }

    @Nullable
    private final Pair zzap(zzbf zzbfVar, int i10, long j10) {
        if (zzbfVar.zzg()) {
            this.zzab = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzac = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzbfVar.zza()) {
            i10 = zzbfVar.zzk(false);
            long j11 = zzbfVar.zzb(i10, this.zza, 0L).zzl;
            j10 = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i10, zzfj.zzq(j10));
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j10) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j10;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int iZzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzai == -1) {
            iZzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, iZzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(@Nullable Object obj) {
        Object obj2 = this.zzN;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z10 ? this.zzA : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zZzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i10, final int i11) {
        if (i10 == this.zzQ.zza() && i11 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i10, i11);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzks.zzd;
                ((zzaz) obj).zzu(i10, i11);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i10, i11));
    }

    private final void zzau() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzav();
            boolean z10 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfj.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzU) {
                throw new IllegalStateException(str2);
            }
            zzee.zzd("ExoPlayerImpl", str2, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i10, int i11, @Nullable Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzml zzmlVar = zzmlVarArr[i12];
            if (i10 == -1 || zzmlVar.zza() == i10) {
                zzmh zzmhVarZzar = zzar(zzmlVar);
                zzmhVarZzar.zzb(i11);
                zzmhVarZzar.zzd(obj);
                zzmhVarZzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            zzml zzmlVar2 = zzmlVarArr2[i13];
            if (zzmlVar2 != null && (i10 == -1 || zzmlVar2.zza() == i10)) {
                zzmh zzmhVarZzar2 = zzar(zzmlVar2);
                zzmhVarZzar2.zzb(i11);
                zzmhVarZzar2.zzd(obj);
                zzmhVarZzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f10) {
        zzav();
        String str = zzfj.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzS == fMax) {
            return;
        }
        this.zzS = fMax;
        this.zzm.zzj(fMax);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i10 = zzks.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(@Nullable Surface surface) {
        zzav();
        zzas(surface);
        int i10 = surface == null ? 0 : -1;
        zzS(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzG(com.google.android.gms.internal.ads.zzwm r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzG(com.google.android.gms.internal.ads.zzwm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb2 = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [AndroidXMedia3/1.9.0-beta01] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(strZza);
        sb2.append(C3978d4.j.f31385e);
        zzee.zzb("ExoPlayerImpl", sb2.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj) {
                    int i10 = zzks.zzd;
                    ((zzaz) obj).zzm(zziw.zzc(new zzlg(1), 1003));
                }
            });
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        zzmd zzmdVar = this.zzaa;
        boolean z10 = zzmdVar.zzp;
        zzmd zzmdVarZzao = zzao(zzmdVar, 1);
        this.zzaa = zzmdVarZzao;
        zzmd zzmdVarZzh = zzmdVarZzao.zzh(zzmdVarZzao.zzb);
        this.zzaa = zzmdVarZzh;
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i10 = zzcz.zza;
        this.zzX = true;
    }

    @Nullable
    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlcVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i10, final int i11) {
        zzav();
        Integer numValueOf = Integer.valueOf(i11);
        zzaw(1, 10, numValueOf);
        zzaw(2, 10, numValueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzks.zzd;
                ((zzaz) obj).zzq(i11);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    public final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i10;
        long j10;
        int i11 = this.zzF - zzlcVar.zzb;
        this.zzF = i11;
        boolean z10 = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i11 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmj) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i12 = 0; i12 < listZzw.size(); i12++) {
                    ((zzko) list.get(i12)).zzc((zzbf) listZzw.get(i12));
                }
            }
            long j11 = -9223372036854775807L;
            if (this.zzH) {
                boolean z11 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j12 = zzlcVar.zza.zzd;
                long j13 = this.zzaa.zzs;
                if (z11 || (zEquals && j12 == j13)) {
                    z10 = false;
                }
                if (z10) {
                    int iZzs = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j10 = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        j10 = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j10);
                    }
                    j11 = j10;
                    i10 = iZzs;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = -1;
                z10 = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z10, this.zzG, j11, i10, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    public final /* synthetic */ void zzT(int i10, int i11, Object obj) {
        zzaw(1, 19, obj);
    }

    public final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    public final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    public final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    public final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    public final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    public final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    public final /* synthetic */ void zzad(boolean z10) {
        this.zzT = z10;
    }

    public final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    public final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    public final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i10, long j10, int i11, boolean z10) {
        zzav();
        if (i10 == -1) {
            return;
        }
        zzgrc.zza(i10 >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i10 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVarZzao = this.zzaa;
            int i12 = zzmdVarZzao.zze;
            if (i12 == 3 || (i12 == 4 && !zzbfVar.zzg())) {
                zzmdVarZzao = zzao(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmd zzmdVarZzan = zzan(zzmdVarZzao, zzbfVar, zzap(zzbfVar, i10, j10));
            this.zzm.zzf(zzbfVar, i10, zzfj.zzq(j10));
            zzal(zzmdVarZzan, 0, true, 1, zzak(zzmdVarZzan), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzmdVarZzf = zzmdVar.zzf(null);
        zzmd zzmdVarZzao = zzao(zzmdVarZzf, true != zzmdVarZzf.zza.zzg() ? 2 : 4);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzmdVarZzao, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z10) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i10 = zzmdVar.zzn;
        int i11 = 0;
        if (i10 == 1) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (zzmdVar.zzl == z10 && i10 == i11 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        zzmd zzmdVarZzi = zzmdVar.zzi(z10, 1, i11);
        this.zzm.zze(z10, 1, i11);
        zzal(zzmdVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (!this.zzaa.zza.zzg()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zza.zze(zzmdVar.zzb.zza);
        }
        int i10 = this.zzab;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int iZzai = zzai(this.zzaa);
        if (iZzai == -1) {
            return 0;
        }
        return iZzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzav();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfj.zzp(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmd zzmdVar = this.zzaa;
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zzk.equals(zzmdVar.zzb) ? zzfj.zzp(this.zzaa.zzq) : zzt();
        }
        zzav();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmd zzmdVar2 = this.zzaa;
        long j10 = 0;
        if (zzmdVar2.zzk.zzd != zzmdVar2.zzb.zzd) {
            return zzfj.zzp(zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j11 = zzmdVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmd zzmdVar3 = this.zzaa;
            zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzmd zzmdVar4 = this.zzaa;
        zzaq(zzmdVar4.zza, zzmdVar4.zzk, j10);
        return zzfj.zzp(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
