package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3978d4;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    public zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final c8.i zze(c8.i iVar, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(iVar, new zzdqx(this, zzdxhVar), this.zza);
        }
        return iVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c8.i zza(final com.google.android.gms.internal.ads.zzfjc r18, final com.google.android.gms.internal.ads.zzfir r19, final org.json.JSONObject r20, @androidx.annotation.Nullable com.google.android.gms.ads.internal.zzb r21, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcce r22) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdra.zza(com.google.android.gms.internal.ads.zzfjc, com.google.android.gms.internal.ads.zzfir, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzcce):c8.i");
    }

    public final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) throws zzenv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int iZzx = zzdohVar.zzx();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb2.append("Invalid template ID: ");
            sb2.append(iZzx);
            throw new zzenv(1, sb2.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            StringBuilder sb3 = new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length());
            sb3.append(strZzD);
            sb3.append(" : ");
            sb3.append(strOptString);
            strOptString = sb3.toString();
        }
        zzdohVar.zzs("headline", strOptString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs(C3978d4.i.U, jSONObject.optString(C3978d4.i.U, null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs(C3978d4.i.F0, jSONObject.optString(C3978d4.i.F0, null));
        return zzdohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdoh zzc(c8.i iVar, c8.i iVar2, c8.i iVar3, c8.i iVar4, c8.i iVar5, JSONObject jSONObject, c8.i iVar6, c8.i iVar7, c8.i iVar8, c8.i iVar9, c8.i iVar10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = (zzdoh) iVar.get();
        zzdohVar.zzd((List) iVar2.get());
        zzdohVar.zzj((zzbks) iVar3.get());
        zzdohVar.zzk((zzbks) iVar4.get());
        zzdohVar.zzc((zzbkl) iVar5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) iVar6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) iVar7.get());
        zzcjl zzcjlVar2 = (zzcjl) iVar8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) iVar9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(iVar9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) iVar10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    public final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}
