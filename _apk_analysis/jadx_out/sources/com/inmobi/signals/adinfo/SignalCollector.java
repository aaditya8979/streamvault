package com.inmobi.signals.adinfo;

import android.os.Bundle;
import bn.r;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.Ui;
import com.inmobi.media.Vi;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class SignalCollector {

    @NotNull
    public static final Ui Companion = new Ui();

    @NotNull
    private static final String TAG = "SignalCollector";

    @NotNull
    private final AppLovinCommunicator communicator;

    @Nullable
    private AppLovinCommunicatorSubscriber communicatorSubscriber;

    @NotNull
    private final List<String> listOfTopics;

    public SignalCollector(@NotNull List<String> list) {
        p.k(list, "listOfTopics");
        this.listOfTopics = list;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance();
        p.j(appLovinCommunicator, "getInstance(...)");
        this.communicator = appLovinCommunicator;
    }

    private final AppLovinCommunicatorSubscriber createSubscriber(sn.p<? super Bundle, ? super String, r> pVar) {
        return new Vi(pVar);
    }

    @NotNull
    public final List<String> getListOfTopics() {
        return this.listOfTopics;
    }

    public final void setupAppLovinCommunicator(@NotNull sn.p<? super Bundle, ? super String, r> pVar) {
        p.k(pVar, "onEvent");
        try {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriberCreateSubscriber = createSubscriber(pVar);
            this.communicatorSubscriber = appLovinCommunicatorSubscriberCreateSubscriber;
            this.communicator.subscribe(appLovinCommunicatorSubscriberCreateSubscriber, this.listOfTopics);
            Objects.toString(this.listOfTopics);
        } catch (Error | Exception unused) {
        }
    }
}
