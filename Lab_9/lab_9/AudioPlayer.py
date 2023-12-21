class AudioPlayer:
    def __init__(self, brand, model, supported_formats, is_portable):
        self._brand = brand
        self._model = model
        self._supported_formats = supported_formats
        self._is_portable = is_portable

    # Getter methods
    def get_brand(self):
        return self._brand

    def get_model(self):
        return self._model

    def get_supported_formats(self):
        return self._supported_formats

    def is_portable(self):
        return self._is_portable

    # Setter methods
    def set_brand(self, brand):
        self._brand = brand

    def set_model(self, model):
        self._model = model

    def set_supported_formats(self, supported_formats):
        self._supported_formats = supported_formats

    def set_portable_status(self, is_portable):
        self._is_portable = is_portable

    # Method to get information about the audio player
    def get_info(self):
        print("Brand:", self._brand)
        print("Model:", self._model)
        print("Supported Formats:", self._supported_formats)
        print("Is Portable:", "Yes" if self._is_portable else "No")
