package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC5232x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f67933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f67934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f67935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f67936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f67937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f67938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f67939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f67940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f67941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f67942j;

    static {
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC4703cb enumC4703cb2 = EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC4703cb enumC4703cb3 = EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC4703cb enumC4703cb4 = EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4703cb enumC4703cb5 = EnumC4703cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4703cb enumC4703cb6 = EnumC4703cb.EVENT_TYPE_ANR;
        f67933a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC4703cb enumC4703cb7 = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        EnumC4703cb enumC4703cb8 = EnumC4703cb.EVENT_TYPE_PURGE_BUFFER;
        EnumC4703cb enumC4703cb9 = EnumC4703cb.EVENT_TYPE_SEND_REFERRER;
        EnumC4703cb enumC4703cb10 = EnumC4703cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4703cb enumC4703cb11 = EnumC4703cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4703cb enumC4703cb12 = EnumC4703cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4703cb enumC4703cb13 = EnumC4703cb.EVENT_TYPE_SET_SESSION_EXTRA;
        f67934b = EnumSet.of(enumC4703cb7, enumC4703cb8, enumC4703cb9, enumC4703cb10, enumC4703cb11, EnumC4703cb.EVENT_TYPE_ACTIVATION, enumC4703cb12, enumC4703cb5, enumC4703cb13);
        EnumC4703cb enumC4703cb14 = EnumC4703cb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC4703cb enumC4703cb15 = EnumC4703cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f67935c = EnumSet.of(enumC4703cb14, enumC4703cb4, enumC4703cb5, enumC4703cb12, enumC4703cb15);
        EnumC4703cb enumC4703cb16 = EnumC4703cb.EVENT_TYPE_REGULAR;
        f67936d = EnumSet.of(enumC4703cb4, enumC4703cb5, enumC4703cb3, enumC4703cb, enumC4703cb2, enumC4703cb15, enumC4703cb12, enumC4703cb16, EnumC4703cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC4703cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC4703cb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC4703cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC4703cb8, EnumC4703cb.EVENT_TYPE_INIT, EnumC4703cb.EVENT_TYPE_SEND_USER_PROFILE, EnumC4703cb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC4703cb9, enumC4703cb10, enumC4703cb11, EnumC4703cb.EVENT_TYPE_FIRST_ACTIVATION, EnumC4703cb.EVENT_TYPE_START, EnumC4703cb.EVENT_TYPE_APP_OPEN, EnumC4703cb.EVENT_TYPE_APP_UPDATE, enumC4703cb6);
        f67937e = EnumSet.of(enumC4703cb16);
        f67938f = EnumSet.of(enumC4703cb16);
        f67939g = EnumSet.of(enumC4703cb12);
        f67940h = EnumSet.of(EnumC4703cb.EVENT_TYPE_ALIVE, enumC4703cb8, enumC4703cb13, enumC4703cb5, enumC4703cb12);
        f67941i = Arrays.asList(0, 6145, Integer.valueOf(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        f67942j = Arrays.asList(12290);
    }
}
