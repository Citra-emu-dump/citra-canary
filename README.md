| Pull Request | Commit | Title | Author | Merged? |
|----|----|----|----|----|
| [6549](https://github.com/citra-emu/citra//pull/6549) | [`a2fd47796`](https://github.com/citra-emu/citra//pull/6549/files) | Spotpass Service Implementation | [Rokkubro](https://github.com/Rokkubro/) | Yes |
| [6698](https://github.com/citra-emu/citra//pull/6698) | [`8012b28b9`](https://github.com/citra-emu/citra//pull/6698/files) | renderer_software: Multi-thread processing | [GPUCode](https://github.com/GPUCode/) | Yes |
| [6705](https://github.com/citra-emu/citra//pull/6705) | [`882fd9c6a`](https://github.com/citra-emu/citra//pull/6705/files) | rasterizer_cache: Remove runtime allocation caching | [GPUCode](https://github.com/GPUCode/) | Yes |
| [6718](https://github.com/citra-emu/citra//pull/6718) | [`1b8b95daf`](https://github.com/citra-emu/citra//pull/6718/files) | service/am: Clean up and optimize CIA installation. | [Steveice10](https://github.com/Steveice10/) | Yes |
| [6721](https://github.com/citra-emu/citra//pull/6721) | [`9d7f5e0d1`](https://github.com/citra-emu/citra//pull/6721/files) | service/apt: Add and implement more service commands. | [Steveice10](https://github.com/Steveice10/) | Yes |
| [6821](https://github.com/citra-emu/citra//pull/6821) | [`fb8d18ea7`](https://github.com/citra-emu/citra//pull/6821/files) | service/gsp: Implement saving of framebuffers in SaveVramSysArea. | [Steveice10](https://github.com/Steveice10/) | Yes |
| [6824](https://github.com/citra-emu/citra//pull/6824) | [`e76f48057`](https://github.com/citra-emu/citra//pull/6824/files) | Move MiiData to its own namespace and add ChecksummedMiiData | [PabloMK7](https://github.com/PabloMK7/) | Yes |


End of merge log. You can find the original README.md below the break.

-----

<h1 align="center">
  <br>
  <a href="https://citra-emu.org/"><img src="https://raw.githubusercontent.com/citra-emu/citra-assets/master/Main/citra_logo.svg" alt="Citra" width="200"></a>
  <br>
  <b>Citra</b>
  <br>
</h1>

<h4 align="center"><b>Citra</b> is the world's most popular, open-source, Nintendo 3DS emulator.
<br>
It is written in C++ with portability in mind and builds are actively maintained for Windows, Linux, Android and macOS.
</h4>

<p align="center">
    <a href="https://github.com/citra-emu/citra/actions/">
        <img src="https://github.com/citra-emu/citra/workflows/citra-ci/badge.svg"
            alt="GitHub Actions Build Status">
    </a>
    <a href="https://discord.gg/FAXfZV9">
        <img src="https://img.shields.io/discord/220740965957107713?color=%237289DA&label=Citra&logo=discord&logoColor=white"
            alt="Discord">
    </a>
</p>

<p align="center">
  <a href="#compatibility">Compatibility</a> |
  <a href="#releases">Releases</a> |
  <a href="#development">Development</a> |
  <a href="#building">Building</a> |
  <a href="#support">Support</a> |
  <a href="#license">License</a>
</p>


## Compatibility

The emulator is capable of running most commercial games at full speed, provided you meet the necessary hardware requirements.

For a full list of games Citra supports, please visit our [Compatibility page](https://citra-emu.org/game/)

Check out our [website](https://citra-emu.org/) for the latest news on exciting features, progress reports, and more!
Please read the [FAQ](https://citra-emu.org/wiki/faq/) before getting started with the project.

Need help? Check out our [asking for help](https://citra-emu.org/help/reference/asking/) guide.

## Releases

Citra has two main release channels: Nightly and Canary.

The [Nightly](https://github.com/citra-emu/citra-nightly) build is based on the master branch, and contains already reviewed and tested features.

The [Canary](https://github.com/citra-emu/citra-canary) build is based on the master branch, but with additional features still under review. PRs tagged `canary-merge` are merged only into the Canary builds.

Both builds can be installed with the installer provided on the [website](https://citra-emu.org/download/), but those looking for specific versions or standalone releases can find them in the release tabs of the [Nightly](https://github.com/citra-emu/citra-nightly/releases) and [Canary](https://github.com/citra-emu/citra-canary/releases) repositories.

Android builds can be downloaded from the Google Play Store.

A Flatpak for Citra is available on [Flathub](https://flathub.org/apps/details/org.citra_emu.citra). Details on the build process can be found in [our Flathub repository](https://github.com/flathub/org.citra_emu.citra).

## Development

Most of the development happens on GitHub. It's also where [our central repository](https://github.com/citra-emu/citra) is hosted.
For development discussion, please join us on our [Discord server](https://citra-emu.org/discord/) or at #citra-dev on libera.

If you want to contribute please take a look at the [Contributor's Guide](https://github.com/citra-emu/citra/wiki/Contributing) and [Developer Information](https://github.com/citra-emu/citra/wiki/Developer-Information). You can also contact any of the developers on Discord in order to know about the current state of the emulator.

If you want to contribute to the user interface translation, please check out the [Citra project on transifex](https://www.transifex.com/citra/citra). We centralize the translation work there, and periodically upstream translations.

## Building

* __Windows__: [Windows Build](https://github.com/citra-emu/citra/wiki/Building-For-Windows)
* __Linux__: [Linux Build](https://github.com/citra-emu/citra/wiki/Building-For-Linux)
* __macOS__: [macOS Build](https://github.com/citra-emu/citra/wiki/Building-for-macOS)
* __Android__: [Android Build](https://github.com/citra-emu/citra/wiki/Building-for-Android)


## Support

If you enjoy the project and want to support us financially, check out our Patreon!

<a href="https://www.patreon.com/citraemu">
    <img src="https://c5.patreon.com/external/logo/become_a_patron_button@2x.png" width="160">
</a>

We also happily accept donated games and hardware.
Please see our [donations page](https://citra-emu.org/donate/) for more information on how you can contribute to Citra.
Any donations received will go towards things like:
* 3DS consoles for developers to explore the hardware
* 3DS games for testing
* Any equipment required for homebrew
* Infrastructure setup

We also more than gladly accept used 3DS consoles! If you would like to give yours away, don't hesitate to join our [Discord server](https://citra-emu.org/discord/) and talk to bunnei.


## License

Citra is licensed under the GPLv2 (or any later version). Refer to the [LICENSE.txt](https://github.com/citra-emu/citra/blob/master/license.txt) file.
