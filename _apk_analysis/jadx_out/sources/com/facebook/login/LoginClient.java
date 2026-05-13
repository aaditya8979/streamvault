package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.R$string;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.ironsource.K5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k2.t;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 m2\u00020\u0001:\u0005x\u0018\u0019yzB\u0011\b\u0016\u0012\u0006\u0010C\u001a\u00020=¢\u0006\u0004\bu\u0010BB\u0011\b\u0016\u0012\u0006\u0010v\u001a\u000201¢\u0006\u0004\bu\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000fH\u0002JF\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0019\u001a\u00020\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ \u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0002J\u0006\u0010'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\nJ\u0006\u0010.\u001a\u00020\u0002J\u0006\u0010/\u001a\u00020\u0002J\b\u00100\u001a\u00020\u001cH\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u001cH\u0016R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010;R.\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u0006\u001a\u0004\u0018\u00010=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010]\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010_\u001a\u0004\bd\u0010a\"\u0004\be\u0010cR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010hR\u0016\u0010j\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010l\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010;R\u0014\u0010o\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010s\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bk\u0010T¨\u0006{"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "Lbn/r;", "i", "", "key", "value", "", "accumulate", "b", "Lcom/facebook/login/LoginClient$Result;", K5.f29723b, "t", "method", "result", "", "loggingExtras", "p", "errorMessage", IronSourceConstants.EVENTS_ERROR_CODE, "q", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, VastAttributes.VERTICAL_POSITION, "c", "d", "Lcom/facebook/login/LoginMethodHandler;", "j", "", "requestCode", C3978d4.f.f31284f, "Landroid/content/Intent;", "data", "u", "", "l", "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", "e", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z", "h", "g", "permission", InneractiveMediationDefs.GENDER_FEMALE, "pendingResult", "B", "r", "s", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "[Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "handlersToTry", "I", "currentHandler", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/Fragment;", CampaignEx.JSON_KEY_AD_K, "()Landroidx/fragment/app/Fragment;", "w", "(Landroidx/fragment/app/Fragment;)V", ContainerActivity.FRAGMENT, "Lcom/facebook/login/LoginClient$d;", "Lcom/facebook/login/LoginClient$d;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$d;", VastAttributes.HORIZONTAL_POSITION, "(Lcom/facebook/login/LoginClient$d;)V", "onCompletedListener", "Lcom/facebook/login/LoginClient$a;", "Lcom/facebook/login/LoginClient$a;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$a;", "v", "(Lcom/facebook/login/LoginClient$a;)V", "backgroundProcessingListener", "Z", "getCheckedInternetPermission", "()Z", "setCheckedInternetPermission", "(Z)V", "checkedInternetPermission", "Lcom/facebook/login/LoginClient$Request;", "o", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "(Lcom/facebook/login/LoginClient$Request;)V", "pendingRequest", "", "Ljava/util/Map;", "getLoggingExtras", "()Ljava/util/Map;", "setLoggingExtras", "(Ljava/util/Map;)V", "getExtraData", "setExtraData", "extraData", "Lcom/facebook/login/o;", "Lcom/facebook/login/o;", "loginLogger", "numActivitiesReturned", InneractiveMediationDefs.GENDER_MALE, "numTotalIntentsFired", "n", "()Lcom/facebook/login/o;", "logger", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "inProgress", "<init>", "source", "(Landroid/os/Parcel;)V", "a", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LoginClient implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LoginMethodHandler[] handlersToTry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int currentHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Fragment fragment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d onCompletedListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a backgroundProcessingListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean checkedInternetPermission;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Request pendingRequest;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<String, String> loggingExtras;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Map<String, String> extraData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o loginLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int numActivitiesReturned;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int numTotalIntentsFired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new b();

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q2\u00020\u0001:\u0001\u000fB}\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u00107\u001a\u00020\u0015\u0012\u0006\u0010&\u001a\u00020\u0015\u0012\u0006\u0010*\u001a\u00020\u0015\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010M¢\u0006\u0004\bT\u0010UB\u0011\b\u0012\u0012\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bT\u0010WJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%R\"\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010$\u001a\u0004\b\u001e\u0010%\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00105\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010%\"\u0004\b4\u0010)R\"\u00107\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b#\u0010%\"\u0004\b6\u0010)R$\u0010:\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b8\u0010%\"\u0004\b9\u0010)R$\u0010=\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010$\u001a\u0004\b;\u0010%\"\u0004\b<\u0010)R\"\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010,R\u0017\u0010J\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\bI\u0010%R\u0019\u0010K\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b2\u0010%R\u0019\u0010L\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010P\u001a\u0004\u0018\u00010M8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b+\u0010OR\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010.¨\u0006X"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "", "C", "shouldSkipAccountDeduplication", "Lbn/r;", "B", "r", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "Lcom/facebook/login/LoginBehavior;", "b", "Lcom/facebook/login/LoginBehavior;", "l", "()Lcom/facebook/login/LoginBehavior;", "loginBehavior", "", "", "c", "Ljava/util/Set;", "p", "()Ljava/util/Set;", VastAttributes.VERTICAL_POSITION, "(Ljava/util/Set;)V", "permissions", "Lcom/facebook/login/DefaultAudience;", "d", "Lcom/facebook/login/DefaultAudience;", "i", "()Lcom/facebook/login/DefaultAudience;", "defaultAudience", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "applicationId", InneractiveMediationDefs.GENDER_FEMALE, "v", "(Ljava/lang/String;)V", "authId", "g", "Z", "u", "()Z", "z", "(Z)V", "isRerequest", "h", CampaignEx.JSON_KEY_AD_K, "setDeviceRedirectUriString", "deviceRedirectUriString", "setAuthType", "authType", "j", "setDeviceAuthTargetUserId", "deviceAuthTargetUserId", "n", VastAttributes.HORIZONTAL_POSITION, "messengerPageId", "q", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", InneractiveMediationDefs.GENDER_MALE, "Lcom/facebook/login/LoginTargetApp;", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "s", "w", "isFamilyLogin", "o", "nonce", "codeVerifier", "codeChallenge", "Lcom/facebook/login/CodeChallengeMethod;", "Lcom/facebook/login/CodeChallengeMethod;", "()Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "t", "isInstagramLogin", "targetApp", "<init>", "(Lcom/facebook/login/LoginBehavior;Ljava/util/Set;Lcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/LoginTargetApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/CodeChallengeMethod;)V", "parcel", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Request implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LoginBehavior loginBehavior;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Set<String> permissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DefaultAudience defaultAudience;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String applicationId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String authId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean isRerequest;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String deviceRedirectUriString;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String authType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String deviceAuthTargetUserId;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String messengerPageId;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public boolean resetMessengerState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LoginTargetApp loginTargetApp;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public boolean isFamilyLogin;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public boolean shouldSkipAccountDeduplication;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String nonce;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String codeVerifier;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String codeChallenge;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final CodeChallengeMethod codeChallengeMethod;

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$Request$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Request;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(@NotNull Parcel source) {
                tn.p.k(source, "source");
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int size) {
                return new Request[size];
            }
        }

        public Request(Parcel parcel) {
            k0 k0Var = k0.f15397a;
            this.loginBehavior = LoginBehavior.valueOf(k0.l(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string = parcel.readString();
            this.defaultAudience = string != null ? DefaultAudience.valueOf(string) : DefaultAudience.NONE;
            this.applicationId = k0.l(parcel.readString(), "applicationId");
            this.authId = k0.l(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = k0.l(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String string2 = parcel.readString();
            this.loginTargetApp = string2 != null ? LoginTargetApp.valueOf(string2) : LoginTargetApp.FACEBOOK;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = k0.l(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string3 = parcel.readString();
            this.codeChallengeMethod = string3 == null ? null : CodeChallengeMethod.valueOf(string3);
        }

        public /* synthetic */ Request(Parcel parcel, tn.i iVar) {
            this(parcel);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Request(@org.jetbrains.annotations.NotNull com.facebook.login.LoginBehavior r2, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.String> r3, @org.jetbrains.annotations.NotNull com.facebook.login.DefaultAudience r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable com.facebook.login.LoginTargetApp r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable com.facebook.login.CodeChallengeMethod r12) {
            /*
                r1 = this;
                java.lang.String r0 = "loginBehavior"
                tn.p.k(r2, r0)
                java.lang.String r0 = "defaultAudience"
                tn.p.k(r4, r0)
                java.lang.String r0 = "authType"
                tn.p.k(r5, r0)
                java.lang.String r0 = "applicationId"
                tn.p.k(r6, r0)
                java.lang.String r0 = "authId"
                tn.p.k(r7, r0)
                r1.<init>()
                r1.loginBehavior = r2
                if (r3 != 0) goto L25
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
            L25:
                r1.permissions = r3
                r1.defaultAudience = r4
                r1.authType = r5
                r1.applicationId = r6
                r1.authId = r7
                if (r8 != 0) goto L33
                com.facebook.login.LoginTargetApp r8 = com.facebook.login.LoginTargetApp.FACEBOOK
            L33:
                r1.loginTargetApp = r8
                if (r9 == 0) goto L46
                int r2 = r9.length()
                if (r2 != 0) goto L3f
                r2 = 1
                goto L40
            L3f:
                r2 = 0
            L40:
                if (r2 == 0) goto L43
                goto L46
            L43:
                r1.nonce = r9
                goto L55
            L46:
                java.util.UUID r2 = java.util.UUID.randomUUID()
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "randomUUID().toString()"
                tn.p.j(r2, r3)
                r1.nonce = r2
            L55:
                r1.codeVerifier = r10
                r1.codeChallenge = r11
                r1.codeChallengeMethod = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.CodeChallengeMethod):void");
        }

        public final void A(boolean z10) {
            this.resetMessengerState = z10;
        }

        public final void B(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        @NotNull
        public final Set<String> p() {
            return this.permissions;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean r() {
            Iterator<String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.INSTANCE.d(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean t() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        public final void v(@NotNull String str) {
            tn.p.k(str, "<set-?>");
            this.authId = str;
        }

        public final void w(boolean z10) {
            this.isFamilyLogin = z10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i10) {
            tn.p.k(parcel, "dest");
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            parcel.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }

        public final void x(@Nullable String str) {
            this.messengerPageId = str;
        }

        public final void y(@NotNull Set<String> set) {
            tn.p.k(set, "<set-?>");
            this.permissions = set;
        }

        public final void z(boolean z10) {
            this.isRerequest = z10;
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0002,\nB9\b\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b%\u0010&BC\b\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b%\u0010(B\u0011\b\u0012\u0012\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b%\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006-"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lbn/r;", "writeToParcel", "Lcom/facebook/login/LoginClient$Result$Code;", "b", "Lcom/facebook/login/LoginClient$Result$Code;", "code", "Lcom/facebook/AccessToken;", "c", "Lcom/facebook/AccessToken;", "token", "Lcom/facebook/AuthenticationToken;", "d", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "e", "Ljava/lang/String;", "errorMessage", InneractiveMediationDefs.GENDER_FEMALE, IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/facebook/login/LoginClient$Request;", "g", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "h", "Ljava/util/Map;", "loggingExtras", "i", "extraData", "<init>", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "j", "Code", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Result implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Code code;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final AccessToken token;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final AuthenticationToken authenticationToken;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String errorMessage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String errorCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Request request;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Map<String, String> loggingExtras;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Map<String, String> extraData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            @NotNull
            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] codeArrValuesCustom = values();
                return (Code[]) Arrays.copyOf(codeArrValuesCustom, codeArrValuesCustom.length);
            }

            @NotNull
            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$Result$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Result;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(@NotNull Parcel source) {
                tn.p.k(source, "source");
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int size) {
                return new Result[size];
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J2\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/login/LoginClient$Result$b;", "", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/facebook/AccessToken;", "token", "Lcom/facebook/login/LoginClient$Result;", "e", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "b", "", "message", "a", "errorType", "errorDescription", IronSourceConstants.EVENTS_ERROR_CODE, "c", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public static /* synthetic */ Result d(Companion companion, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return companion.c(request, str, str2, str3);
            }

            @NotNull
            public final Result a(@Nullable Request request, @Nullable String message) {
                return new Result(request, Code.CANCEL, null, message, null);
            }

            @NotNull
            public final Result b(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            @NotNull
            public final Result c(@Nullable Request request, @Nullable String errorType, @Nullable String errorDescription, @Nullable String errorCode) {
                ArrayList arrayList = new ArrayList();
                if (errorType != null) {
                    arrayList.add(errorType);
                }
                if (errorDescription != null) {
                    arrayList.add(errorDescription);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), errorCode);
            }

            @NotNull
            public final Result e(@Nullable Request request, @NotNull AccessToken token) {
                tn.p.k(token, "token");
                return new Result(request, Code.SUCCESS, token, null, null);
            }
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = Code.valueOf(string == null ? "error" : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = j0.m0(parcel);
            this.extraData = j0.m0(parcel);
        }

        public /* synthetic */ Result(Parcel parcel, tn.i iVar) {
            this(parcel);
        }

        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @Nullable String str, @Nullable String str2) {
            tn.p.k(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable String str, @Nullable String str2) {
            this(request, code, accessToken, null, str, str2);
            tn.p.k(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i10) {
            tn.p.k(parcel, "dest");
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i10);
            parcel.writeParcelable(this.authenticationToken, i10);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i10);
            j0 j0Var = j0.f15387a;
            j0.B0(parcel, this.loggingExtras);
            j0.B0(parcel, this.extraData);
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginClient$a;", "", "Lbn/r;", "a", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(@NotNull Parcel source) {
            tn.p.k(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int size) {
            return new LoginClient[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/login/LoginClient$c;", "", "", "b", "", "a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @NotNull
        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3978d4.a.f31210f, System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            tn.p.j(string, "e2e.toString()");
            return string;
        }

        public final int b() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/LoginClient$d;", "", "Lcom/facebook/login/LoginClient$Result;", "result", "Lbn/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface d {
        void a(@NotNull Result result);
    }

    public LoginClient(@NotNull Parcel parcel) {
        tn.p.k(parcel, "source");
        this.currentHandler = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.n(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.handlersToTry = (LoginMethodHandler[]) array;
        this.currentHandler = parcel.readInt();
        this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
        Map<String, String> mapM0 = j0.m0(parcel);
        this.loggingExtras = mapM0 == null ? null : kotlin.collections.a.C(mapM0);
        Map<String, String> mapM02 = j0.m0(parcel);
        this.extraData = mapM02 != null ? kotlin.collections.a.C(mapM02) : null;
    }

    public LoginClient(@NotNull Fragment fragment) {
        tn.p.k(fragment, ContainerActivity.FRAGMENT);
        this.currentHandler = -1;
        w(fragment);
    }

    public final void A() {
        LoginMethodHandler loginMethodHandlerJ = j();
        if (loginMethodHandlerJ != null) {
            q(loginMethodHandlerJ.getNameForLogging(), "skipped", null, null, loginMethodHandlerJ.f());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i10 = this.currentHandler;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i10 + 1;
            if (z()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:6:0x0013, B:8:0x0021, B:10:0x003d, B:9:0x002e), top: B:17:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(@org.jetbrains.annotations.NotNull com.facebook.login.LoginClient.Result r8) {
        /*
            r7 = this;
            java.lang.String r0 = "pendingResult"
            tn.p.k(r8, r0)
            com.facebook.AccessToken r0 = r8.token
            if (r0 == 0) goto L58
            com.facebook.AccessToken$c r0 = com.facebook.AccessToken.INSTANCE
            com.facebook.AccessToken r0 = r0.e()
            com.facebook.AccessToken r1 = r8.token
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getUserId()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getUserId()     // Catch: java.lang.Exception -> L41
            boolean r0 = tn.p.f(r0, r1)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L2e
            com.facebook.login.LoginClient$Result$b r0 = com.facebook.login.LoginClient.Result.INSTANCE     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Request r1 = r7.pendingRequest     // Catch: java.lang.Exception -> L41
            com.facebook.AccessToken r2 = r8.token     // Catch: java.lang.Exception -> L41
            com.facebook.AuthenticationToken r8 = r8.authenticationToken     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Result r8 = r0.b(r1, r2, r8)     // Catch: java.lang.Exception -> L41
            goto L3d
        L2e:
            com.facebook.login.LoginClient$Result$b r0 = com.facebook.login.LoginClient.Result.INSTANCE     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Request r1 = r7.pendingRequest     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "User logged in as different Facebook user."
            r3 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            com.facebook.login.LoginClient$Result r8 = com.facebook.login.LoginClient.Result.Companion.d(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L41
        L3d:
            r7.g(r8)     // Catch: java.lang.Exception -> L41
            goto L57
        L41:
            r8 = move-exception
            com.facebook.login.LoginClient$Result$b r0 = com.facebook.login.LoginClient.Result.INSTANCE
            com.facebook.login.LoginClient$Request r1 = r7.pendingRequest
            java.lang.String r3 = r8.getMessage()
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r2 = "Caught exception"
            com.facebook.login.LoginClient$Result r8 = com.facebook.login.LoginClient.Result.Companion.d(r0, r1, r2, r3, r4, r5, r6)
            r7.g(r8)
        L57:
            return
        L58:
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r0 = "Can't validate without a token"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.B(com.facebook.login.LoginClient$Result):void");
    }

    public final void b(String str, String str2, boolean z10) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void c(@Nullable Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.INSTANCE.g() || e()) {
            this.pendingRequest = request;
            this.handlersToTry = l(request);
            A();
        }
    }

    public final void d() {
        LoginMethodHandler loginMethodHandlerJ = j();
        if (loginMethodHandlerJ == null) {
            return;
        }
        loginMethodHandlerJ.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (f("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        FragmentActivity activity = getActivity();
        g(Result.Companion.d(Result.INSTANCE, this.pendingRequest, activity == null ? null : activity.getString(R$string.com_facebook_internet_permission_error_title), activity != null ? activity.getString(R$string.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    public final int f(@NotNull String permission) {
        tn.p.k(permission, "permission");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return -1;
        }
        return activity.checkCallingOrSelfPermission(permission);
    }

    public final void g(@NotNull Result result) {
        tn.p.k(result, K5.f29723b);
        LoginMethodHandler loginMethodHandlerJ = j();
        if (loginMethodHandlerJ != null) {
            p(loginMethodHandlerJ.getNameForLogging(), result, loginMethodHandlerJ.f());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        t(result);
    }

    @Nullable
    public final FragmentActivity getActivity() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final void h(@NotNull Result result) {
        tn.p.k(result, K5.f29723b);
        if (result.token == null || !AccessToken.INSTANCE.g()) {
            g(result);
        } else {
            B(result);
        }
    }

    public final void i() {
        g(Result.Companion.d(Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    @Nullable
    public final LoginMethodHandler j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.currentHandler;
        if (i10 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    @Nullable
    public LoginMethodHandler[] l(@NotNull Request request) {
        tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.t()) {
            if (loginBehavior.getAllowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!t.bypassAppSwitch && loginBehavior.getAllowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!t.bypassAppSwitch && loginBehavior.getAllowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.t() && loginBehavior.getAllowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean m() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.login.o n() {
        /*
            r3 = this;
            com.facebook.login.o r0 = r3.loginLogger
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.b()
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.getApplicationId()
        L12:
            boolean r1 = tn.p.f(r1, r2)
            if (r1 != 0) goto L36
        L18:
            com.facebook.login.o r0 = new com.facebook.login.o
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 != 0) goto L24
            android.content.Context r1 = k2.t.l()
        L24:
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto L2d
            java.lang.String r2 = k2.t.m()
            goto L31
        L2d:
            java.lang.String r2 = r2.getApplicationId()
        L31:
            r0.<init>(r1, r2)
            r3.loginLogger = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.n():com.facebook.login.o");
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void p(String str, Result result, Map<String, String> map) {
        q(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    public final void q(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        if (request == null) {
            n().j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            n().c(request.getAuthId(), str, str2, str3, str4, map, request.getIsFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    public final void r() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void s() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final void t(Result result) {
        d dVar = this.onCompletedListener;
        if (dVar == null) {
            return;
        }
        dVar.a(result);
    }

    public final boolean u(int requestCode, int resultCode, @Nullable Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                A();
                return false;
            }
            LoginMethodHandler loginMethodHandlerJ = j();
            if (loginMethodHandlerJ != null && (!loginMethodHandlerJ.o() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return loginMethodHandlerJ.k(requestCode, resultCode, data);
            }
        }
        return false;
    }

    public final void v(@Nullable a aVar) {
        this.backgroundProcessingListener = aVar;
    }

    public final void w(@Nullable Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        tn.p.k(parcel, "dest");
        parcel.writeParcelableArray(this.handlersToTry, i10);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i10);
        j0 j0Var = j0.f15387a;
        j0.B0(parcel, this.loggingExtras);
        j0.B0(parcel, this.extraData);
    }

    public final void x(@Nullable d dVar) {
        this.onCompletedListener = dVar;
    }

    public final void y(@Nullable Request request) {
        if (m()) {
            return;
        }
        c(request);
    }

    public final boolean z() {
        LoginMethodHandler loginMethodHandlerJ = j();
        if (loginMethodHandlerJ == null) {
            return false;
        }
        if (loginMethodHandlerJ.j() && !e()) {
            b("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int iP = loginMethodHandlerJ.p(request);
        this.numActivitiesReturned = 0;
        if (iP > 0) {
            n().e(request.getAuthId(), loginMethodHandlerJ.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.numTotalIntentsFired = iP;
        } else {
            n().d(request.getAuthId(), loginMethodHandlerJ.getNameForLogging(), request.getIsFamilyLogin() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            b("not_tried", loginMethodHandlerJ.getNameForLogging(), true);
        }
        return iP > 0;
    }
}
