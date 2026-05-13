package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg1 f89255a = new zg1();

    public final Location a(List list) {
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f89255a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j10 = zg1.f97567a;
                boolean z10 = time > j10;
                boolean z11 = time < (-j10);
                boolean z12 = time > 0;
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                boolean z13 = accuracy > 0;
                boolean z14 = accuracy < 0;
                boolean z15 = ((long) accuracy) > 200;
                boolean zF = tn.p.f(location2.getProvider(), location.getProvider());
                if (!z10 && (z11 || (!z14 && ((!z12 || z13) && (!z12 || z15 || !zF))))) {
                }
            }
            location = location2;
        }
        return location;
    }
}
