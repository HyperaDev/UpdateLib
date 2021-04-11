/*
 * Copyright (c) 2021 Joshua Sing <joshua@hypera.dev>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package dev.hypera.updatelib.internal;

public class UpdateResponse {

	private final boolean updateAvailable;
	private final String currentVersion;
	private final String spigotVersion;

	public UpdateResponse(boolean updateAvailable, String currentVersion, String spigotVersion) {
		this.updateAvailable = updateAvailable;
		this.currentVersion = currentVersion;
		this.spigotVersion = spigotVersion;
	}

	/**
	 * Is an update available?
	 *
	 * @return Update available.
	 * @since 2.0.0-SNAPSHOT
	 */
	public boolean isUpdateAvailable() {
		return updateAvailable;
	}

	/**
	 * Get the current version of the plugin.
	 *
	 * @return Current version.
	 * @since 2.0.0-SNAPSHOT
	 */
	public String getCurrentVersion() {
		return currentVersion;
	}

	/**
	 * Get the current version of the plugin on SpigotMC.
	 *
	 * @return Current SpigotMC version.
	 * @since 2.0.0-SNAPSHOT
	 */
	public String getSpigotVersion() {
		return spigotVersion;
	}

}
