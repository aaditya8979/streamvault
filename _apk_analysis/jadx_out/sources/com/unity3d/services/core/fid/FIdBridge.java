package com.unity3d.services.core.fid;

import cn.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4157n2;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FIdBridge.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FIdBridge extends GenericBridge {

    @NotNull
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(@NotNull Object obj) {
        super(p0.g(new Pair(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        p.k(obj, C4157n2.f33007p);
        this.instance = obj;
    }

    @NotNull
    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task<String> taskForResult = Tasks.forResult(null);
        p.j(taskForResult, "forResult(null)");
        return taskForResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
