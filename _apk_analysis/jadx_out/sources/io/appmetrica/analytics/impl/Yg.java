package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes9.dex */
public final class Yg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N8 f66265b;

    public Yg(@NonNull Y4 y42) {
        this(y42, y42.j());
    }

    public Yg(Y4 y42, N8 n82) {
        super(y42);
        this.f66265b = n82;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        EnumC4753ea enumC4753ea;
        if (!TextUtils.isEmpty(q52.getName())) {
            N8 n82 = this.f66265b;
            String name = q52.getName();
            if (n82.f65631c == null) {
                n82.a();
            }
            int iHashCode = name.hashCode();
            if (n82.f65631c.f65742b.contains(Integer.valueOf(iHashCode))) {
                enumC4753ea = EnumC4753ea.NON_FIRST_OCCURENCE;
            } else {
                P8 p82 = n82.f65631c;
                EnumC4753ea enumC4753ea2 = p82.f65741a ? EnumC4753ea.FIRST_OCCURRENCE : EnumC4753ea.UNKNOWN;
                if (p82.f65744d < 1000) {
                    p82.f65742b.add(Integer.valueOf(iHashCode));
                    p82.f65744d++;
                } else {
                    p82.f65741a = false;
                }
                S8 s82 = n82.f65630b;
                P8 p83 = n82.f65631c;
                IBinaryDataHelper iBinaryDataHelper = s82.f65872c;
                R8 r82 = s82.f65871b;
                s82.f65870a.getClass();
                iBinaryDataHelper.insert("event_hashes", r82.toByteArray(Q8.a(p83)));
                enumC4753ea = enumC4753ea2;
            }
            q52.f65798k = enumC4753ea;
        }
        return false;
    }
}
