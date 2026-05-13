package yads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.webkit.internal.AssetHelper;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import yads.o90;

/* JADX INFO: loaded from: classes8.dex */
public final class o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntegrationInspectorActivity f93156a;

    public o90(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f93156a = integrationInspectorActivity;
    }

    public static final void a(DialogInterface dialogInterface, int i10) {
    }

    public static final void a(sn.a aVar, DialogInterface dialogInterface, int i10) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void b(DialogInterface dialogInterface, int i10) {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.f93156a).setMessage(str).setPositiveButton(this.f93156a.getString(R$string.f59101ok), new DialogInterface.OnClickListener() { // from class: bt.k7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.b(dialogInterface, i10);
            }
        }).show();
    }

    public final void a(String str, String str2, final n90 n90Var) {
        new AlertDialog.Builder(this.f93156a).setTitle(str).setMessage(str2).setPositiveButton(this.f93156a.getString(R$string.yes), new DialogInterface.OnClickListener() { // from class: bt.i7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.a(n90Var, dialogInterface, i10);
            }
        }).setNegativeButton(this.f93156a.getString(R$string.f59100no), new DialogInterface.OnClickListener() { // from class: bt.j7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.a(dialogInterface, i10);
            }
        }).show();
    }

    public final void a(m90 m90Var) {
        if (m90Var instanceof j90) {
            Toast.makeText(this.f93156a, ((j90) m90Var).f91130a, 0).show();
            return;
        }
        if (m90Var instanceof l90) {
            a(((l90) m90Var).f91910a);
            return;
        }
        if (m90Var instanceof k90) {
            Uri uri = ((k90) m90Var).f91521a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f93156a, intent);
            return;
        }
        if (m90Var instanceof i90) {
            a(this.f93156a.getString(R$string.logging_is_disabled), this.f93156a.getString(R$string.do_you_want_to_enable_logging), new n90(this));
        } else if (m90Var instanceof h90) {
            this.f93156a.finishAfterTransition();
        }
    }
}
