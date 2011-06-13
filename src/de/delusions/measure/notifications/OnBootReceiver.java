/*
   Copyright 2011 Sonja Pieper

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package de.delusions.measure.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OnBootReceiver extends BroadcastReceiver {

	private final static String LOG_TAG = OnBootReceiver.class.getName();

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(LOG_TAG, "BOOT_COMPLETED received");
		// XXX: If onReceive fails for no apparent reason, 
		// start a service to run AlarmController.setRepeating()
		// because onReceive should return very quickly.
		AlarmController.setRepeating(context);
	}
}
