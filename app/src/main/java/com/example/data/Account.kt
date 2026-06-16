package com.example.data

enum class AccountRole {
    REGULAR, DEVELOPER, BUSINESS
}

data class LocalAccount(
    val email: String,
    val role: AccountRole,
    val passport: String = "",
    val businessDocs: String = ""
)

object SparePartsDataProvider {
    val sparePartsList = listOf(
        Phone(
            id = "part_screen_9a",
            name = "Оригинальный дисплейный модуль Redmi 9A",
            brand = "REDMI",
            price = 480,
            description = "Фирменный IPS-дисплей высшего качества. Восстанавливает величие вашего Redmi 9A после ударов судьбы. Картинка сочная, отклик сверхзвуковой, олеофобное покрытие премиального уровня.",
            rating = 4.9,
            reviewsCount = 48,
            specs = listOf(
                "Тип детали" to "Дисплейный модуль в сборе",
                "Совместимость" to "Xiaomi Redmi 9A / 9C",
                "Диагональ & Разрешение" to "6.53 дюйма, HD+ (1600x720)",
                "Цветопередача" to "Оригинальный уровень яркости и контрастности"
            ),
            highlightColorHex = "#E53935",
            isSparePart = true
        ),
        Phone(
            id = "part_battery_9a",
            name = "Квантовая турбо-батарея Redmi 9A",
            brand = "REDMI",
            price = 350,
            description = "Полноценный оригинальный аккумулятор увеличенной нано-плотности. Творит чудеса энергосбережения, заряжается за мгновение и возвращает смартфону легендарную автономность на долгие годы.",
            rating = 5.0,
            reviewsCount = 74,
            specs = listOf(
                "Тип детали" to "Литий-полимерный аккумулятор",
                "Емкость" to "5000 мАч (Квантовый нано-заряд)",
                "Номинальное напряжение" to "3.85 В",
                "Ресурс" to "Свыше 1000 циклов без падения емкости"
            ),
            highlightColorHex = "#E53935",
            isSparePart = true
        ),
        Phone(
            id = "part_hinge_quantum",
            name = "Титановый шарнир для OPPO Quantum Fold",
            brand = "OPPO",
            price = 1200,
            description = "Шедевр микро-инженерии. Высокотехнологичный складной механизм из сверхпрочного авиационного титана. Обеспечивает бесшовное складывание гибкого экрана без зазоров и складок.",
            rating = 4.8,
            reviewsCount = 12,
            specs = listOf(
                "Тип детали" to "Шарнирный механизм складывания",
                "Материал" to "Титановый сплав космического класса + аморфный сплав",
                "Ресурс" to "Рассчитан на 1 000 000 складываний",
                "Особая фишка" to "Полное отсутствие люфтов и мягкий приятный ход"
            ),
            highlightColorHex = "#00BCD4",
            isSparePart = true
        ),
        Phone(
            id = "part_camera_oppo9000",
            name = "Камера Hasselblad 50 Мп для Oppo X-Pro 9000",
            brand = "OPPO",
            price = 850,
            description = "Оригинальная заменяемая основная светосильная камера дюймового формата с оптической стабилизацией. Захватывает максимальное количество света для невероятных художественных кадров.",
            rating = 4.9,
            reviewsCount = 19,
            specs = listOf(
                "Тип детали" to "Модуль основной камеры",
                "Сенсор" to "Sony LYT-900 (1 дюйм)",
                "Разрешение" to "50 Мп с поддержкой Hasselblad Color Science",
                "Стабилизация" to "Физическая оптическая (OIS 4-осевая)"
            ),
            highlightColorHex = "#009688",
            isSparePart = true
        ),
        Phone(
            id = "part_mainboard_sixseven",
            name = "Материнская плата VIVO SUPER SIXSEVEN (16/512GB)",
            brand = "VIVO",
            price = 1800,
            description = "Сердце вашего смартфона в сборе. Оригинальная системная плата со встроенным суперпроцессором Dimensity 9300+, скоростной памятью 16 ГБ RAM и накопителем 512 ГБ ROM.",
            rating = 5.0,
            reviewsCount = 7,
            specs = listOf(
                "Тип детали" to "Материнская плата (Mainboard)",
                "Память" to "16 ГБ RAM / 512 ГБ UFS 4.0 ROM",
                "Процессор" to "MediaTek Dimensity 9300+",
                "Поддержка стандартов" to "5G, Wi-Fi 7, NFC"
            ),
            highlightColorHex = "#2196F3",
            isSparePart = true
        ),
        Phone(
            id = "part_charger_120w",
            name = "Блок ультра-зарядки VIVO FlashCharge 120W",
            brand = "VIVO",
            price = 390,
            description = "Сетевой адаптер питания невероятной мощности, изготовленный на основе нитрида галлия (GaN). Имеет скромные габариты и заряжает совместимые флагманы до 100% за считанные минуты без нагрева.",
            rating = 4.9,
            reviewsCount = 114,
            specs = listOf(
                "Тип детали" to "Сетевое зарядное устройство (GaN)",
                "Максимальная мощность" to "120 Вт (6.0А / 20В)",
                "Разъем" to "USB Type-C",
                "Защита" to "10 уровней умной защиты от перегрузок и перегрева"
            ),
            highlightColorHex = "#2196F3",
            isSparePart = true
        )
    )
}

