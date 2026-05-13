package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f68137a;

    public n(p pVar) {
        this.f68137a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f68137a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f68143e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f68139a.f68116a);
                tVar2.f68150c.add(pVar.f68141c);
                Iterator it = pVar.f68142d.iterator();
                while (it.hasNext()) {
                    tVar2.f68150c.add((Consumer) it.next());
                }
                pVar.f68143e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f68148a = pVar.f68139a.f68116a;
            }
            if (tVar.f68151d != null) {
                boolean zDidTimePassMillis = tVar.f68149b.didTimePassMillis(tVar.f68152e, tVar.f68148a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z10 = true;
                boolean z11 = location.distanceTo(tVar.f68151d) > tVar.f68148a.getUpdateDistanceInterval();
                if (tVar.f68151d != null && location.getTime() - tVar.f68151d.getTime() < 0) {
                    z10 = false;
                }
                if ((!zDidTimePassMillis && !z11) || !z10) {
                    return;
                }
            }
            tVar.f68151d = location;
            tVar.f68152e = System.currentTimeMillis();
            Iterator it2 = tVar.f68150c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
