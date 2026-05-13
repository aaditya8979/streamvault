package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes10.dex */
final class zzkt extends zzkx {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzkt() {
        super(null);
    }

    public /* synthetic */ zzkt(zzks zzksVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzmv.zzf(obj, j10);
        if (list instanceof zzkr) {
            objUnmodifiableList = ((zzkr) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlq) && (list instanceof zzkj)) {
                zzkj zzkjVar = (zzkj) list;
                if (zzkjVar.zzc()) {
                    zzkjVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmv.zzs(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List list3 = (List) zzmv.zzf(obj2, j10);
        int size = list3.size();
        List list4 = (List) zzmv.zzf(obj, j10);
        if (list4.isEmpty()) {
            List zzkqVar = list4 instanceof zzkr ? new zzkq(size) : ((list4 instanceof zzlq) && (list4 instanceof zzkj)) ? ((zzkj) list4).zzd(size) : new ArrayList(size);
            zzmv.zzs(obj, j10, zzkqVar);
            list2 = zzkqVar;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzmv.zzs(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzmq) {
                zzkq zzkqVar2 = new zzkq(list4.size() + size);
                zzkqVar2.addAll(zzkqVar2.size(), (zzmq) list4);
                zzmv.zzs(obj, j10, zzkqVar2);
                list = zzkqVar2;
            } else {
                boolean z10 = list4 instanceof zzlq;
                list2 = list4;
                if (z10) {
                    boolean z11 = list4 instanceof zzkj;
                    list2 = list4;
                    if (z11) {
                        zzkj zzkjVar = (zzkj) list4;
                        list2 = list4;
                        if (!zzkjVar.zzc()) {
                            zzkj zzkjVarZzd = zzkjVar.zzd(list4.size() + size);
                            zzmv.zzs(obj, j10, zzkjVarZzd);
                            list2 = zzkjVarZzd;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzmv.zzs(obj, j10, list3);
    }
}
