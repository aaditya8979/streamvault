package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxh implements zzabb, zzvz {
    public final /* synthetic */ zzxq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzxd zze;
    private final zzaex zzf;
    private final zzdq zzg;
    private final zzafv zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;

    @Nullable
    private zzagh zzm;
    private boolean zzn;

    public zzxh(zzxq zzxqVar, Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzaex zzaexVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzxdVar;
        this.zzf = zzaexVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafv();
        this.zzj = true;
        this.zzb = zzwb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j10, @Nullable String str) {
        Map mapZzd = zzxq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzguh zzguhVar = new zzguh();
            zzguhVar.zzb(mapZzd.entrySet());
            zzguhVar.zza("If-Range", str);
            mapZzd = zzguhVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j10);
        zzheVar.zzd(6);
        zzheVar.zzb(mapZzd);
        return zzheVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzer zzerVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzerVar.zzd();
        zzagh zzaghVar = this.zzm;
        zzaghVar.getClass();
        zzaghVar.zzc(zzerVar, iZzd);
        zzaghVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0205 A[EDGE_INSN: B:145:0x0205->B:99:0x0205 BREAK  A[LOOP:1: B:87:0x01ce->B:148:0x01ce], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:7:0x000d, B:14:0x0039, B:16:0x0047, B:18:0x004d, B:22:0x0059, B:23:0x005f, B:26:0x007a, B:27:0x0080, B:36:0x00bc, B:38:0x00c6, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x011a, B:54:0x0124, B:55:0x012a, B:64:0x0164, B:66:0x016d, B:68:0x017a, B:70:0x0182, B:72:0x019d, B:58:0x0134, B:61:0x0152, B:31:0x008c, B:34:0x00aa), top: B:128:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9 A[Catch: all -> 0x0223, TryCatch #0 {all -> 0x0223, blocks: (B:74:0x01b0, B:76:0x01b9, B:77:0x01bc, B:79:0x01c0), top: B:122:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0 A[Catch: all -> 0x0223, TRY_LEAVE, TryCatch #0 {all -> 0x0223, blocks: (B:74:0x01b0, B:76:0x01b9, B:77:0x01bc, B:79:0x01c0), top: B:122:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzc():void");
    }

    public final /* synthetic */ void zzd(long j10, long j11) {
        this.zzh.zza = j10;
        this.zzk = j11;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }
}
