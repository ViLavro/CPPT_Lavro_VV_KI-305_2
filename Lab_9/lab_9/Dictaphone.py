from AudioPlayer import AudioPlayer
class Dictaphone(AudioPlayer):
    def __init__(self, brand, model, supported_formats, is_portable, recording_time, microphone_quality):
        # Викликаємо конструктор батьківського класу AudioPlayer
        super().__init__(brand, model, supported_formats, is_portable)
        self._recording_time = recording_time
        self._microphone_quality = microphone_quality

    # Додані методи для отримання значень часу запису та якості мікрофона
    def get_recording_time(self):
        return self._recording_time

    def get_microphone_quality(self):
        return self._microphone_quality

    # Додані методи для встановлення значень часу запису та якості мікрофона
    def set_recording_time(self, recording_time):
        self._recording_time = recording_time

    def set_microphone_quality(self, microphone_quality):
        self._microphone_quality = microphone_quality

    # Перевизначений метод для виведення інформації про диктофон
    def get_info(self):
        # Викликаємо метод батьківського класу для отримання загальної інформації
        super().get_info()
        print("Recording Time:", self._recording_time)
        print("Microphone Quality:", self._microphone_quality)
