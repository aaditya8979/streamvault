package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzidf<T> implements zzidu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i10, int i11, zzidc zzidcVar, boolean z10, int[] iArr2, int i12, int i13, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z11 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j10) {
        return ((Double) zziem.zzn(obj, j10)).doubleValue();
    }

    private static float zzH(Object obj, long j10) {
        return ((Float) zziem.zzn(obj, j10)).floatValue();
    }

    private static int zzI(Object obj, long j10) {
        return ((Integer) zziem.zzn(obj, j10)).intValue();
    }

    private static long zzJ(Object obj, long j10) {
        return ((Long) zziem.zzn(obj, j10)).longValue();
    }

    private static boolean zzK(Object obj, long j10) {
        return ((Boolean) zziem.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private final boolean zzM(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 != 1048575) {
            return (zziem.zzd(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziem.zzl(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziem.zzj(obj, j11)) != 0;
            case 2:
                return zziem.zzf(obj, j11) != 0;
            case 3:
                return zziem.zzf(obj, j11) != 0;
            case 4:
                return zziem.zzd(obj, j11) != 0;
            case 5:
                return zziem.zzf(obj, j11) != 0;
            case 6:
                return zziem.zzd(obj, j11) != 0;
            case 7:
                return zziem.zzh(obj, j11);
            case 8:
                Object objZzn = zziem.zzn(obj, j11);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzian) {
                    return !zzian.zza.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziem.zzn(obj, j11) != null;
            case 10:
                return !zzian.zza.equals(zziem.zzn(obj, j11));
            case 11:
                return zziem.zzd(obj, j11) != 0;
            case 12:
                return zziem.zzd(obj, j11) != 0;
            case 13:
                return zziem.zzd(obj, j11) != 0;
            case 14:
                return zziem.zzf(obj, j11) != 0;
            case 15:
                return zziem.zzd(obj, j11) != 0;
            case 16:
                return zziem.zzf(obj, j11) != 0;
            case 17:
                return zziem.zzn(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zziem.zze(obj, j10, (1 << (iZzB >>> 20)) | zziem.zzd(obj, j10));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        return zziem.zzd(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final void zzQ(Object obj, int i10, int i11) {
        zziem.zze(obj, zzB(i11) & 1048575, i10);
    }

    private final int zzR(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzS(i10, 0);
    }

    private final int zzS(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static final int zzT(byte[] bArr, int i10, int i11, zzies zziesVar, Class cls, zziab zziabVar) throws IOException {
        int i12;
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                i12 = i10 + 8;
                zziabVar.zzc = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                zziabVar.zzc = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i10)));
                break;
            case 2:
            case 3:
                int iZzc = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziabVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziabVar.zza);
                return iZza;
            case 5:
            case 15:
                i12 = i10 + 8;
                zziabVar.zzc = Long.valueOf(zziac.zze(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                zziabVar.zzc = Integer.valueOf(zziac.zzd(bArr, i10));
                break;
            case 7:
                int iZzc2 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Boolean.valueOf(zziabVar.zzb != 0);
                return iZzc2;
            case 8:
                return zziac.zzf(bArr, i10, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i10, i11, zziabVar);
            case 11:
                return zziac.zzg(bArr, i10, zziabVar);
            case 16:
                int iZza2 = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziaq.zzK(zziabVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziaq.zzL(zziabVar.zzb));
                return iZzc3;
        }
        return i12;
    }

    private static final void zzU(int i10, Object obj, zzieu zzieuVar) throws IOException {
        if (obj instanceof String) {
            zzieuVar.zzm(i10, (String) obj);
        } else {
            zzieuVar.zzn(i10, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzidf zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzicz r35, com.google.android.gms.internal.ads.zzidi r36, com.google.android.gms.internal.ads.zzico r37, com.google.android.gms.internal.ads.zzief r38, com.google.android.gms.internal.ads.zzibc r39, com.google.android.gms.internal.ads.zzicx r40) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzicz, com.google.android.gms.internal.ads.zzidi, com.google.android.gms.internal.ads.zzico, com.google.android.gms.internal.ads.zzief, com.google.android.gms.internal.ads.zzibc, com.google.android.gms.internal.ads.zzicx):com.google.android.gms.internal.ads.zzidf");
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzidu zziduVarZzq = zzq(i10);
            if (!zzN(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzP(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzidu zziduVarZzq = zzq(i10);
            if (!zzP(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzQ(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzidu zziduVar = (zzidu) objArr[i12];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zziduVarZzb = zzidm.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zziduVarZzb;
        return zziduVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzibx zzs(int i10) {
        int i11 = i10 / 3;
        return (zzibx) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzidu zziduVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzidu zziduVarZzq = zzq(i11);
        if (!zzP(obj, i10, i11)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzQ(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzief zziefVar, Object obj3) {
        zzibx zzibxVarZzs;
        int i11 = this.zzc[i10];
        Object objZzn = zziem.zzn(obj, zzA(i10) & 1048575);
        if (objZzn == null || (zzibxVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzicu zzicuVarZze = ((zzicv) zzr(i10)).zze();
        Iterator it = ((zzicw) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzibxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int iZzc = zzicv.zzc(zzicuVarZze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, iZzc);
                try {
                    zzicv.zzb(zziatVar, zzicuVarZze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i11, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzidp zzidpVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zziem.zzo(obj, j10, zzidpVar.zzn());
        } else if (this.zzi) {
            zziem.zzo(obj, j10, zzidpVar.zzm());
        } else {
            zziem.zzo(obj, j10, zzidpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            long j10 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zziem.zzl(obj, j10)) != Double.doubleToLongBits(zziem.zzl(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zziem.zzj(obj, j10)) != Float.floatToIntBits(zziem.zzj(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zziem.zzh(obj, j10) != zziem.zzh(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
                    break;
                case 50:
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzB = zzB(i10) & 1048575;
                    if (zziem.zzd(obj, jZzB) != zziem.zzd(obj2, jZzB) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzibr) obj).zzt.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i12);
            int i14 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zziem.zzl(obj, j10));
                    Charset charset = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zziem.zzj(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset2 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset3 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset4 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzice.zzb(zziem.zzh(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzn = zziem.zzn(obj, j10);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset5 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    Charset charset6 = zzice.zza;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzn2 = zziem.zzn(obj, j10);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j10));
                        Charset charset7 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset8 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset9 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset10 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzice.zzb(zzK(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset11 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        Charset charset12 = zzice.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzP(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzidw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzidw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i10);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzC) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zziem.zzm(obj, j10, zziem.zzl(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i10)) {
                        zziem.zzk(obj, j10, zziem.zzj(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i10)) {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i10)) {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i10)) {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i10)) {
                        zziem.zzi(obj, j10, zziem.zzh(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i10)) {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i10)) {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i10)) {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i10)) {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzicd zzicdVarZzh = (zzicd) zziem.zzn(obj, j10);
                    zzicd zzicdVar = (zzicd) zziem.zzn(obj2, j10);
                    int size = zzicdVarZzh.size();
                    int size2 = zzicdVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzicdVarZzh.zza()) {
                            zzicdVarZzh = zzicdVarZzh.zzh(size2 + size);
                        }
                        zzicdVarZzh.addAll(zzicdVar);
                    }
                    if (size > 0) {
                        zzicdVar = zzicdVarZzh;
                    }
                    zziem.zzo(obj, j10, zzicdVar);
                    break;
                case 50:
                    int i13 = zzidw.zza;
                    zziem.zzo(obj, j10, zzicx.zzb(zziem.zzn(obj, j10), zziem.zzn(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzP(obj2, i12, i10)) {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i12, i10)) {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0560  */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v261 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0245  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r22, com.google.android.gms.internal.ads.zzieu r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzieu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r11, com.google.android.gms.internal.ads.zzidp r12, com.google.android.gms.internal.ads.zzibb r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzg(java.lang.Object, com.google.android.gms.internal.ads.zzidp, com.google.android.gms.internal.ads.zzibb):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:446:0x0af7, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0e3a, code lost:
    
        if (r5 == 1048575) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e3c, code lost:
    
        r10.putInt(r11, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0e40, code lost:
    
        r8 = r14.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0e47, code lost:
    
        if (r8 >= r14.zzl) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0e49, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzieg) zzx(r35, r14.zzj[r8], r3, r14.zzm, r35);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0e5f, code lost:
    
        if (r3 == null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0e61, code lost:
    
        r14.zzm.zzi(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0e66, code lost:
    
        if (r6 != 0) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0e68, code lost:
    
        if (r7 != r12) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0e72, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0e73, code lost:
    
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0e75, code lost:
    
        if (r7 > r12) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0e77, code lost:
    
        if (r9 != r6) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0e79, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0e7f, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0db3 A[PHI: r0 r8 r10 r11 r14 r20 r21 r31
      0x0db3: PHI (r0v211 int) = 
      (r0v178 int)
      (r0v179 int)
      (r0v180 int)
      (r0v181 int)
      (r0v182 int)
      (r0v183 int)
      (r0v184 int)
      (r0v185 int)
      (r0v188 int)
      (r0v198 int)
      (r0v212 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r8v112 int) = 
      (r8v90 int)
      (r8v91 int)
      (r8v92 int)
      (r8v93 int)
      (r8v94 int)
      (r8v95 int)
      (r8v96 int)
      (r8v97 int)
      (r8v98 int)
      (r8v103 int)
      (r8v113 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r10v60 sun.misc.Unsafe) = 
      (r10v37 sun.misc.Unsafe)
      (r10v38 sun.misc.Unsafe)
      (r10v39 sun.misc.Unsafe)
      (r10v40 sun.misc.Unsafe)
      (r10v41 sun.misc.Unsafe)
      (r10v42 sun.misc.Unsafe)
      (r10v43 sun.misc.Unsafe)
      (r10v44 sun.misc.Unsafe)
      (r10v45 sun.misc.Unsafe)
      (r10v50 sun.misc.Unsafe)
      (r10v61 sun.misc.Unsafe)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r11v84 java.lang.Object) = 
      (r11v61 java.lang.Object)
      (r11v62 java.lang.Object)
      (r11v63 java.lang.Object)
      (r11v64 java.lang.Object)
      (r11v65 java.lang.Object)
      (r11v66 java.lang.Object)
      (r11v67 java.lang.Object)
      (r11v68 java.lang.Object)
      (r11v70 java.lang.Object)
      (r11v79 java.lang.Object)
      (r11v85 java.lang.Object)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r14v90 com.google.android.gms.internal.ads.zzidf<T>) = 
      (r14v70 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v71 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v72 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v73 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v74 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v75 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v76 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v77 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v78 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v82 com.google.android.gms.internal.ads.zzidf<T>)
      (r14v91 com.google.android.gms.internal.ads.zzidf<T>)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r20v38 java.lang.String) = 
      (r20v16 java.lang.String)
      (r20v17 java.lang.String)
      (r20v18 java.lang.String)
      (r20v19 java.lang.String)
      (r20v20 java.lang.String)
      (r20v21 java.lang.String)
      (r20v22 java.lang.String)
      (r20v23 java.lang.String)
      (r20v24 java.lang.String)
      (r20v29 java.lang.String)
      (r20v39 java.lang.String)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r21v38 int) = 
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v31 int)
      (r21v35 int)
      (r21v30 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r31v44 int) = 
      (r31v26 int)
      (r31v27 int)
      (r31v28 int)
      (r31v29 int)
      (r31v30 int)
      (r31v31 int)
      (r31v32 int)
      (r31v33 int)
      (r31v34 int)
      (r31v38 int)
      (r31v45 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0e09  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x09a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x09ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zziab r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zziab):int");
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zziab zziabVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zziabVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzk(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzl(java.lang.Object):boolean");
    }
}
