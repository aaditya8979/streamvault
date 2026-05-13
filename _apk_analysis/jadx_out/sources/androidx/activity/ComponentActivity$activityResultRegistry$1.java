package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import com.safedk.android.utils.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    public final /* synthetic */ ComponentActivity this$0;

    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, ActivityResultContract.SynchronousResult synchronousResult) {
        tn.p.k(componentActivity$activityResultRegistry$1, "this$0");
        componentActivity$activityResultRegistry$1.dispatchResult(i10, synchronousResult.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, IntentSender.SendIntentException sendIntentException) {
        tn.p.k(componentActivity$activityResultRegistry$1, "this$0");
        tn.p.k(sendIntentException, "$e");
        componentActivity$activityResultRegistry$1.dispatchResult(i10, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
    }

    public static void safedk_ActivityCompat_startActivityForResult_74eed790eeaf1053cab0beb2ce57b465(Activity activity, Intent intent, int i10, Bundle bundle) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/app/ActivityCompat;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (intent == null) {
            return;
        }
        ActivityCompat.startActivityForResult(activity, intent, i10, bundle);
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(final int i10, @NotNull ActivityResultContract<I, O> activityResultContract, I i11, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        tn.p.k(activityResultContract, "contract");
        ComponentActivity componentActivity = this.this$0;
        final ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i11);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.i
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0(this.f4025b, i10, synchronousResult);
                }
            });
            return;
        }
        Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i11);
        Bundle bundle = null;
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            tn.p.h(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            bundle = intentCreateIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            intentCreateIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        } else if (activityOptionsCompat != null) {
            bundle = activityOptionsCompat.toBundle();
        }
        Bundle bundle2 = bundle;
        if (tn.p.f(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i10);
            return;
        }
        if (!tn.p.f(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, intentCreateIntent.getAction())) {
            safedk_ActivityCompat_startActivityForResult_74eed790eeaf1053cab0beb2ce57b465(componentActivity, intentCreateIntent, i10, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
        try {
            tn.p.h(intentSenderRequest);
            ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
        } catch (IntentSender.SendIntentException e10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.j
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1(this.f4028b, i10, e10);
                }
            });
        }
    }
}
