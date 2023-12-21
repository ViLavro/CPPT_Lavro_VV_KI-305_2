from Dictaphone import AudioPlayer, Dictaphone
if __name__ == "__main__":
    # Створення об'єкта AudioPlayer
    my_audio_player = AudioPlayer(brand="Sony", model="Walkman", supported_formats=["MP3", "WAV", "AAC"],
                                  is_portable=True)

    # Виведення інформації про аудіоплеєр
    print("=== Audio Player Information ===")
    my_audio_player.get_info()
    print("==============================")

    # Зміна деяких параметрів
    my_audio_player.set_model("Walkman Pro")
    my_audio_player.set_supported_formats(["MP3", "FLAC", "WAV"])
    my_audio_player.set_portable_status(False)

    # Виведення оновленої інформації про аудіоплеєр
    print("\n=== Updated Audio Player Information ===")
    my_audio_player.get_info()
    print("======================================")

    # Створення об'єкта Dictaphone
    my_dictaphone = Dictaphone(brand="Sony", model="ICD-UX570", supported_formats=["MP3", "WAV", "AAC"],
                               is_portable=True, recording_time="20 hours", microphone_quality="High")

    # Виведення інформації про диктофон
    print("=== Dictaphone Information ===")
    my_dictaphone.get_info()
    print("==============================")

    # Зміна деяких параметрів
    my_dictaphone.set_recording_time("30 hours")
    my_dictaphone.set_microphone_quality("Very High")

    # Виведення оновленої інформації про диктофон
    print("\n=== Updated Dictaphone Information ===")
    my_dictaphone.get_info()
    print("====================================")
