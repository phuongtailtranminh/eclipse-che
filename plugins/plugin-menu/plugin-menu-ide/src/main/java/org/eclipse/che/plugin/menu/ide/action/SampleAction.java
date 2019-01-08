package org.eclipse.che.plugin.menu.ide.action;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.che.ide.api.action.ActionEvent;
import org.eclipse.che.ide.api.action.BaseAction;
import org.eclipse.che.ide.api.notification.NotificationManager;
import org.eclipse.che.ide.api.notification.StatusNotification;

/** Sample action. */
@Singleton
public class SampleAction extends BaseAction {

  private final NotificationManager notificationManager;

  @Inject
  public SampleAction(NotificationManager notificationManager) {
    super("Say Hello", "Sample action");
    this.notificationManager = notificationManager;
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    notificationManager.notify(
        "Hello form Che!!!",
        StatusNotification.Status.SUCCESS,
        StatusNotification.DisplayMode.FLOAT_MODE);
  }
}
