package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import ao.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ActivityResultRegistry {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    @NotNull
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    @NotNull
    private static final String LOG_TAG = "ActivityResultRegistry";

    @NotNull
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    @NotNull
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    @NotNull
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();

    @NotNull
    private final List<String> launchedKeys = new ArrayList();

    @NotNull
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();

    @NotNull
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    @NotNull
    private final Bundle pendingResults = new Bundle();

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class CallbackAndContract<O> {

        @NotNull
        private final ActivityResultCallback<O> callback;

        @NotNull
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(@NotNull ActivityResultCallback<O> activityResultCallback, @NotNull ActivityResultContract<?, O> activityResultContract) {
            p.k(activityResultCallback, "callback");
            p.k(activityResultContract, "contract");
            this.callback = activityResultCallback;
            this.contract = activityResultContract;
        }

        @NotNull
        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        @NotNull
        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class LifecycleContainer {

        @NotNull
        private final Lifecycle lifecycle;

        @NotNull
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(@NotNull Lifecycle lifecycle) {
            p.k(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(@NotNull LifecycleEventObserver lifecycleEventObserver) {
            p.k(lifecycleEventObserver, "observer");
            this.lifecycle.addObserver(lifecycleEventObserver);
            this.observers.add(lifecycleEventObserver);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }

        @NotNull
        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    private final void bindRcKey(int i10, String str) {
        this.rcToKey.put(Integer.valueOf(i10), str);
        this.keyToRc.put(str, Integer.valueOf(i10));
    }

    private final <O> void doDispatch(String str, int i10, Intent intent, CallbackAndContract<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null || !this.launchedKeys.contains(str)) {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i10, intent));
            this.launchedKeys.remove(str);
        }
    }

    private final int generateRandomNumber() {
        for (Number number : r.o(new sn.a<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @Nullable
            public final Integer invoke() {
                return Integer.valueOf(Random.Default.nextInt(2147418112) + 65536);
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.k(activityResultRegistry, "this$0");
        p.k(str, "$key");
        p.k(activityResultCallback, "$callback");
        p.k(activityResultContract, "$contract");
        p.k(lifecycleOwner, "<anonymous parameter 0>");
        p.k(event, "event");
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                activityResultRegistry.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    activityResultRegistry.unregister$activity_release(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
            Object obj = activityResultRegistry.parsedPendingResults.get(str);
            activityResultRegistry.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void registerKey(String str) {
        if (this.keyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i10, int i11, @Nullable Intent intent) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        doDispatch(str, i11, intent, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public final <O> boolean dispatchResult(int i10, O o10) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o10);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        p.i(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(o10);
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i10, @NotNull ActivityResultContract<I, O> activityResultContract, I i11, @Nullable ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (bundle2 != null) {
            this.pendingResults.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    y.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            p.j(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            p.j(str2, "keys[i]");
            bindRcKey(iIntValue, str2);
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        p.k(bundle, "outState");
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <I, O> ActivityResultLauncher<I> register(@NotNull final String str, @NotNull final ActivityResultContract<I, O> activityResultContract, @NotNull ActivityResultCallback<O> activityResultCallback) {
        p.k(str, "key");
        p.k(activityResultContract, "contract");
        p.k(activityResultCallback, "callback");
        registerKey(str);
        this.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.parsedPendingResults.containsKey(str)) {
            Object obj = this.parsedPendingResults.get(str);
            this.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.3
            @Override // androidx.activity.result.ActivityResultLauncher
            @NotNull
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i10, @Nullable ActivityOptionsCompat activityOptionsCompat) throws Exception {
                Object obj2 = ActivityResultRegistry.this.keyToRc.get(str);
                Object obj3 = activityResultContract;
                if (obj2 != null) {
                    int iIntValue = ((Number) obj2).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(str);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, activityResultContract, i10, activityOptionsCompat);
                        return;
                    } catch (Exception e10) {
                        ActivityResultRegistry.this.launchedKeys.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(str);
            }
        };
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> register(@NotNull final String str, @NotNull LifecycleOwner lifecycleOwner, @NotNull final ActivityResultContract<I, O> activityResultContract, @NotNull final ActivityResultCallback<O> activityResultCallback) {
        p.k(str, "key");
        p.k(lifecycleOwner, "lifecycleOwner");
        p.k(activityResultContract, "contract");
        p.k(activityResultCallback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            registerKey(str);
            LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.c
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ActivityResultRegistry.register$lambda$1(this.f4039b, str, activityResultCallback, activityResultContract, lifecycleOwner2, event);
                }
            });
            this.keyToLifecycleContainers.put(str, lifecycleContainer);
            return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.2
                @Override // androidx.activity.result.ActivityResultLauncher
                @NotNull
                public ActivityResultContract<I, ?> getContract() {
                    return (ActivityResultContract<I, ?>) activityResultContract;
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void launch(I i10, @Nullable ActivityOptionsCompat activityOptionsCompat) throws Exception {
                    Object obj = ActivityResultRegistry.this.keyToRc.get(str);
                    Object obj2 = activityResultContract;
                    if (obj != null) {
                        int iIntValue = ((Number) obj).intValue();
                        ActivityResultRegistry.this.launchedKeys.add(str);
                        try {
                            ActivityResultRegistry.this.onLaunch(iIntValue, activityResultContract, i10, activityOptionsCompat);
                            return;
                        } catch (Exception e10) {
                            ActivityResultRegistry.this.launchedKeys.remove(str);
                            throw e10;
                        }
                    }
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void unregister() {
                    ActivityResultRegistry.this.unregister$activity_release(str);
                }
            };
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    @MainThread
    public final void unregister$activity_release(@NotNull String str) {
        Integer numRemove;
        p.k(str, "key");
        if (!this.launchedKeys.contains(str) && (numRemove = this.keyToRc.remove(str)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(str);
        if (this.parsedPendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.parsedPendingResults.get(str));
            this.parsedPendingResults.remove(str);
        }
        if (this.pendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + ((ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class)));
            this.pendingResults.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(str);
        }
    }
}
