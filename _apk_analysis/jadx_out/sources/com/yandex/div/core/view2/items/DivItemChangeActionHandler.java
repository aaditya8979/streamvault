package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DivItemChangeActionHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivItemChangeActionHandler {

    @NotNull
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean canHandle(@org.jetbrains.annotations.Nullable java.lang.String r1) {
        /*
            if (r1 == 0) goto L54
            int r0 = r1.hashCode()
            switch(r0) {
                case -1789088446: goto L49;
                case -1509135083: goto L40;
                case -1348467885: goto L37;
                case -1280379330: goto L2e;
                case -770388272: goto L25;
                case -88123690: goto L1c;
                case 633820873: goto L13;
                case 1099321339: goto La;
                default: goto L9;
            }
        L9:
            goto L54
        La:
            java.lang.String r0 = "scroll_to_position"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L13:
            java.lang.String r0 = "scroll_to_end"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L54
            goto L52
        L1c:
            java.lang.String r0 = "set_current_item"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L25:
            java.lang.String r0 = "scroll_to_start"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L2e:
            java.lang.String r0 = "set_previous_item"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L37:
            java.lang.String r0 = "scroll_forward"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L40:
            java.lang.String r0 = "scroll_backward"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L49:
            java.lang.String r0 = "set_next_item"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L54
        L52:
            r1 = 1
            goto L55
        L54:
            r1 = 0
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.items.DivItemChangeActionHandler.canHandle(java.lang.String):boolean");
    }

    private final Direction direction(String str) {
        return p.f(str, "set_previous_item") ? Direction.PREVIOUS : p.f(str, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }

    private final int getStepParam(Uri uri, int i10) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return i10;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            KAssert kAssert = KAssert.INSTANCE;
            if (!Assert.isEnabled()) {
                return i10;
            }
            Assert.fail(queryParameter + " is not a number");
            return i10;
        }
    }

    public static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean handleAction(@NotNull Uri uri, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.Companion;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController divViewWithItemsControllerCreate = companion.create(queryParameter, divViewFacade, expressionResolver, divItemChangeActionHandler.direction(authority));
        if (divViewWithItemsControllerCreate == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean z10 = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority == null) {
            return false;
        }
        switch (authority.hashCode()) {
            case -1789088446:
                if (authority.equals("set_next_item")) {
                    break;
                }
                break;
            case -1509135083:
                if (authority.equals("scroll_backward")) {
                    break;
                }
                break;
            case -1348467885:
                if (authority.equals("scroll_forward")) {
                    break;
                }
                break;
            case -1280379330:
                if (authority.equals("set_previous_item")) {
                    break;
                }
                break;
            case -770388272:
                if (authority.equals("scroll_to_start")) {
                    break;
                }
                break;
            case -88123690:
                if (authority.equals("set_current_item")) {
                    break;
                }
                break;
            case 633820873:
                if (authority.equals("scroll_to_end")) {
                    break;
                }
                break;
            case 1099321339:
                if (authority.equals("scroll_to_position")) {
                    break;
                }
                break;
        }
        return false;
    }

    private final boolean handleNextItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollTo(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollTo(getStepParam$default(this, uri, 0, 1, null), z10);
        return true;
    }

    private final boolean handleScrollToTheEnd(boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToEnd(z10);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean z10, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToStart(z10);
        return true;
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean z10, DivViewWithItemsController divViewWithItemsController) {
        String queryParameter = uri.getQueryParameter("item");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            divViewWithItemsController.setCurrentItem(Integer.parseInt(queryParameter), z10);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter + " is not a number");
            }
            return false;
        }
    }
}
