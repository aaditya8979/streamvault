package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaeq implements zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaep zzc = new zzaep(new zzaeo() { // from class: com.google.android.gms.internal.ads.zzaen
        @Override // com.google.android.gms.internal.ads.zzaeo
        public final /* synthetic */ Constructor zza() {
            int i10 = zzaeq.zza;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaep zzd = new zzaep(new zzaeo() { // from class: com.google.android.gms.internal.ads.zzaem
        @Override // com.google.android.gms.internal.ads.zzaeo
        public final /* synthetic */ Constructor zza() {
            int i10 = zzaeq.zza;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzaeu.class).getConstructor(new Class[0]);
        }
    });

    @Nullable
    private zzguf zze;
    private final zzamd zzf = new zzaly();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzaoc());
                break;
            case 1:
                list.add(new zzaof());
                break;
            case 2:
                list.add(new zzaoi(0));
                break;
            case 3:
                list.add(new zzagp(0));
                break;
            case 4:
                zzaeu zzaeuVarZza = zzc.zza(0);
                if (zzaeuVarZza == null) {
                    list.add(new zzahg(0));
                } else {
                    list.add(zzaeuVarZza);
                }
                break;
            case 5:
                list.add(new zzahj());
                break;
            case 6:
                list.add(new zzajh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzajp(0));
                break;
            case 8:
                zzamd zzamdVar = this.zzf;
                list.add(new zzako(zzamdVar, 0, null, null, zzguf.zzi(), null));
                list.add(new zzakw(zzamdVar, 0));
                break;
            case 9:
                list.add(new zzalm());
                break;
            case 10:
                list.add(new zzapm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzguf.zzi();
                }
                list.add(new zzapx(1, 0, this.zzf, new zzfg(0L), new zzaok(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqk());
                break;
            case 14:
                list.add(new zzahq(0));
                break;
            case 15:
                zzaeu zzaeuVarZza2 = zzd.zza(new Object[0]);
                if (zzaeuVarZza2 != null) {
                    list.add(zzaeuVarZza2);
                }
                break;
            case 16:
                list.add(new zzagt(0, this.zzf));
                break;
            case 17:
                list.add(new zzalw());
                break;
            case 18:
                list.add(new zzaqp());
                break;
            case 19:
                list.add(new zzahb());
                break;
            case 20:
                list.add(new zzahp(0));
                break;
            case 21:
                list.add(new zzaha());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fa A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fa, B:139:0x01fd, B:259:0x03c2, B:260:0x03c5, B:262:0x03ca, B:265:0x03d0, B:266:0x03d3, B:267:0x03d6, B:142:0x0206, B:144:0x020e, B:147:0x0218, B:150:0x0224, B:152:0x022c, B:155:0x0236, B:158:0x0241, B:161:0x024c, B:164:0x0257, B:166:0x025f, B:168:0x0267, B:171:0x0271, B:173:0x027f, B:176:0x0289, B:179:0x0294, B:181:0x029c, B:183:0x02aa, B:185:0x02b8, B:188:0x02c8, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02f8, B:202:0x0302, B:204:0x030a, B:207:0x031a, B:209:0x0322, B:212:0x032c, B:214:0x0334, B:217:0x033e, B:219:0x0346, B:222:0x034f, B:225:0x035b, B:228:0x0367, B:231:0x0373, B:233:0x037b, B:236:0x0384, B:238:0x038c, B:241:0x0395, B:14:0x0047, B:15:0x004f, B:114:0x01c0, B:17:0x0054, B:20:0x0060, B:23:0x006b, B:26:0x0077, B:29:0x0083, B:32:0x008e, B:35:0x009a, B:38:0x00a5, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0154, B:86:0x0160, B:89:0x016b, B:92:0x0176, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a1, B:107:0x01ab, B:110:0x01b5), top: B:273:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0206 A[Catch: all -> 0x03e0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fa, B:139:0x01fd, B:259:0x03c2, B:260:0x03c5, B:262:0x03ca, B:265:0x03d0, B:266:0x03d3, B:267:0x03d6, B:142:0x0206, B:144:0x020e, B:147:0x0218, B:150:0x0224, B:152:0x022c, B:155:0x0236, B:158:0x0241, B:161:0x024c, B:164:0x0257, B:166:0x025f, B:168:0x0267, B:171:0x0271, B:173:0x027f, B:176:0x0289, B:179:0x0294, B:181:0x029c, B:183:0x02aa, B:185:0x02b8, B:188:0x02c8, B:190:0x02d6, B:193:0x02e0, B:195:0x02e8, B:197:0x02f0, B:199:0x02f8, B:202:0x0302, B:204:0x030a, B:207:0x031a, B:209:0x0322, B:212:0x032c, B:214:0x0334, B:217:0x033e, B:219:0x0346, B:222:0x034f, B:225:0x035b, B:228:0x0367, B:231:0x0373, B:233:0x037b, B:236:0x0384, B:238:0x038c, B:241:0x0395, B:14:0x0047, B:15:0x004f, B:114:0x01c0, B:17:0x0054, B:20:0x0060, B:23:0x006b, B:26:0x0077, B:29:0x0083, B:32:0x008e, B:35:0x009a, B:38:0x00a5, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0154, B:86:0x0160, B:89:0x016b, B:92:0x0176, B:95:0x0181, B:98:0x018c, B:101:0x0197, B:104:0x01a1, B:107:0x01ab, B:110:0x01b5), top: B:273:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzafa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzaeu[] zzb(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzaeu[]");
    }
}
