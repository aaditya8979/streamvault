package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.FacebookException;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import k2.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FacebookDialogBase.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"com/facebook/internal/FacebookDialogBase$createActivityResultContractForShowingDialog$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Lk2/h$a;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "content", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", C3978d4.f.f31284f, "intent", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookDialogBase$createActivityResultContractForShowingDialog$1 extends ActivityResultContract<Object, h.ActivityResultParameters> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g<Object, Object> f15277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2.h f15279c;

    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h.ActivityResultParameters parseResult(int resultCode, @Nullable Intent intent) {
        k2.h hVar = this.f15279c;
        if (hVar != null) {
            hVar.onActivityResult(this.f15277a.getRequestCodeField(), resultCode, intent);
        }
        return new h.ActivityResultParameters(this.f15277a.getRequestCodeField(), resultCode, intent);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, Object content) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        g.a(this.f15277a, content, this.f15278b);
        throw new FacebookException("Content " + content + " is not supported");
    }
}
