package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import yads.q20;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class q20 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f93867b = 0;

    static {
        m51 m51Var = p51.f93439c;
        new q20(sm2.f94878f);
        new wq() { // from class: bt.p8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return q20.a(bundle);
            }
        };
    }

    public q20(List list) {
        p51.a((Collection) list);
    }

    public static final q20 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f93439c;
            sm2VarA = sm2.f94878f;
        } else {
            sm2VarA = yq.a(o20.f93084t, parcelableArrayList);
        }
        return new q20(sm2VarA);
    }
}
