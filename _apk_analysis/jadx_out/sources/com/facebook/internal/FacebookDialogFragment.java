package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.internal.m;
import com.facebook.internal.o0;
import com.ironsource.C3978d4;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FacebookDialogFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002R$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lbn/r;", "onCreate", "e", "()V", "Landroid/app/Dialog;", "onCreateDialog", C3978d4.i.f31366u0, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onDestroyView", "values", "Lcom/facebook/FacebookException;", "error", "h", "i", "b", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "j", "(Landroid/app/Dialog;)V", "innerDialog", "<init>", "c", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Dialog innerDialog;

    public static final void f(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        tn.p.k(facebookDialogFragment, "this$0");
        facebookDialogFragment.h(bundle, facebookException);
    }

    public static final void g(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        tn.p.k(facebookDialogFragment, "this$0");
        facebookDialogFragment.i(bundle);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    public final void e() {
        FragmentActivity activity;
        o0 o0VarA;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            d0 d0Var = d0.f15326a;
            tn.p.j(intent, "intent");
            Bundle bundleV = d0.v(intent);
            if (bundleV == null ? false : bundleV.getBoolean("is_fallback", false)) {
                String string = bundleV != null ? bundleV.getString("url") : null;
                if (j0.X(string)) {
                    j0.e0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                tn.x xVar = tn.x.f85368a;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{k2.t.m()}, 1));
                tn.p.j(str, "java.lang.String.format(format, *args)");
                m.Companion companion = m.INSTANCE;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                o0VarA = companion.a(activity, string, str);
                o0VarA.B(new o0.e() { // from class: com.facebook.internal.i
                    @Override // com.facebook.internal.o0.e
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        FacebookDialogFragment.g(this.f15368a, bundle, facebookException);
                    }
                });
            } else {
                String string2 = bundleV == null ? null : bundleV.getString("action");
                Bundle bundle = bundleV != null ? bundleV.getBundle("params") : null;
                if (j0.X(string2)) {
                    j0.e0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    o0VarA = new o0.a(activity, string2, bundle).g(new o0.e() { // from class: com.facebook.internal.h
                        @Override // com.facebook.internal.o0.e
                        public final void a(Bundle bundle2, FacebookException facebookException) {
                            FacebookDialogFragment.f(this.f15365a, bundle2, facebookException);
                        }
                    }).a();
                }
            }
            this.innerDialog = o0VarA;
        }
    }

    public final void h(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        d0 d0Var = d0.f15326a;
        Intent intent = activity.getIntent();
        tn.p.j(intent, "fragmentActivity.intent");
        activity.setResult(facebookException == null ? -1 : 0, d0.m(intent, bundle, facebookException));
        activity.finish();
    }

    public final void i(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void j(@Nullable Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        tn.p.k(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.innerDialog instanceof o0) && isResumed()) {
            Dialog dialog = this.innerDialog;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((o0) dialog).x();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        e();
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        h(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        tn.p.j(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof o0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((o0) dialog).x();
        }
    }
}
