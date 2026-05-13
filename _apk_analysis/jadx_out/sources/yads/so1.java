package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class so1 {
    public static Map a(fo1 fo1Var) {
        MediatedAdapterInfo mediatedAdapterInfoB = fo1Var.b();
        Pair[] pairArr = new Pair[3];
        String adapterVersion = mediatedAdapterInfoB.getAdapterVersion();
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        pairArr[0] = bn.h.a("mediation_adapter_version", adapterVersion);
        String networkName = mediatedAdapterInfoB.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        pairArr[1] = bn.h.a("mediation_network_name", networkName);
        String networkSdkVersion = mediatedAdapterInfoB.getNetworkSdkVersion();
        pairArr[2] = bn.h.a("mediation_network_sdk_version", networkSdkVersion != null ? networkSdkVersion : "null");
        return kotlin.collections.a.m(pairArr);
    }
}
