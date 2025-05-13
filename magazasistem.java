package finalprojec;
import java.util.Scanner;

public class magazasistem {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Mağazamıza Hoşgeldiniz \n");

            System.out.print("İsminiz nedir: ");
            String name = input.nextLine();

            System.out.println("\nMerhabalar " + name);

            System.out.println(" Hangi ülkede yaşıyorusunuz : ");
            String ulke = input.nextLine();

            System.out.println("Hangi il de yaşıyorsunuz : ");
            String il = input.nextLine();


            System.out.print("Siparişi hangi bölgeye teslim etmemizi istersiniz: ");
            String ev = input.nextLine();

            System.out.print("Mağazamızdan hangi reyondan alışveriş yapmak istersiniz: ");
            String reyon = input.nextLine();

            System.out.println(reyon + " reyonu ile devam ediyoruz...");
            System.out.print("\nHangi kategori ile devam edelim (Üst giyim/Dış giyim/Alt giyim): ");
            String kategori = input.nextLine();

            switch (kategori) {
                case "Üst giyim":
                    System.out.println(" ");
                    System.out.print("Şimdi bu kategoriden ne seçmek istersiniz: ");
                    String tst = input.nextLine();

                    switch (tst) {
                        case "t-shirt":
                        case "Gömlek":
                        case "sweat":
                            System.out.print("Hangi markayı tercih edersiniz: ");
                            String marka = input.nextLine();

                            System.out.print("Bu markanın hangi modelini istersiniz: ");
                            String model = input.nextLine();

                            switch (model) {
                                case "Uzun kollu":
                                case "Kısa kollu":
                                case "Kapüşon":
                                case "Sıfır kol":
                                    System.out.println(model + " seçiminiz ile devam ediyoruz...");

                                    System.out.print(model + " hangi rengi tercih edersiniz: ");
                                    String renk = input.nextLine();

                                    switch (renk) {
                                        case "Mavi":
                                        case "Sarı":
                                        case "Kırmızı":
                                        case "Beyaz":
                                            System.out.println("Hangi bedenini tercih edersiniz: ");
                                            String beden = input.nextLine();
                                            switch (beden) {
                                                case "S":
                                                case "M":
                                                case "L":
                                                case "XL":
                                                    System.out.print(beden + " bedeni seçtiğinizi görüyorum");
                                                    int adet = 3000;

                                                    System.out.println(adet + " vardır. ");
                                                    double fiyat = 299.99;
                                                    System.out.println(reyon + " reyonundan " + tst + " " + marka + " " + model + " modelini " + renk + " " + beden + " bedenden tercih etmişsiniz.");

                                                    System.out.println(fiyat + " TL onaylıyor musunuz: ");
                                                    String onay = input.nextLine();

                                                    System.out.println("Siparişinizi onaylıyoruz...");
                                                    System.out.println("Siparişiniz verilmiştir.");

                                                    System.out.println(ev + " bu adrese 5 gün içinde ulaşılacaktır.");
                                                    break;
                                                case "XXL":
                                                    System.out.println("XXL bedeni seçtiğinizi görüyorum");
                                                    int adedi = 3000;

                                                    System.out.println(adedi + " adet vardır. ");
                                                    double fiyat1 = 349.99;

                                                    System.out.println(reyon + " reyonundan " + tst + " " + marka + " " + model + " modelini " + renk + " " + beden + " tercih etmişsiniz.");

                                                    System.out.print(fiyat1 + " TL onaylıyor musunuz: ");
                                                    String onay1 = input.nextLine();

                                                    System.out.println("Siparişinizi onaylıyoruz...");
                                                    System.out.println("Siparişiniz verilmiştir.");

                                                    System.out.println(ev + " bu adrese 5 gün içinde ulaşılacaktır.");

                                                    if (onay1.equals("onaylamiyorum")) {
                                                        System.out.println("Siparişiniz iptal edilmiştir.");
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Yanlış bilgi girişi yapıldı.");
                                                    System.out.println("Çıkış yapılıyor...");
                                            }
                                            break;
                                        default:
                                            System.out.println("Böyle bir renk şu anda bulunmamaktadır...");
                                    }
                                    break;
                                default:
                                    System.out.println("Böyle bir model bulunamamaktadır.");
                            }
                            break;
                        default:
                            System.out.println("Şu anda elimizde kalmamıştır.");
                    }
                    break;
                case "Dış giyim":
                    System.out.println("Bu kategoriden ne seçmek istersiniz (Ceket/Mont/Hırka) ");
                    String giyim = input.nextLine();

                    switch (giyim) {
                        case "Ceket":
                        case "Mont":
                        case "Hırka":
                        case "Yelek":
                            System.out.print(giyim + " hangi modelini seçmek istersiniz: ");
                            String mdl = input.nextLine();

                            switch (mdl) {
                                case "Deri":
                                case "Şişme":
                                case "Triko":
                                    System.out.print(mdl + " " + giyim + " bu modelin hangi markasını tercih edersiniz: ");
                                    String mrk = input.nextLine();

                                    System.out.print("Bu modelin hangi rengini istersiniz: ");
                                    String rnk = input.nextLine();

                                    System.out.print("Bu marka ve modelden hangi bedeni tercih etmek istersiniz: ");
                                    String bdn = input.nextLine();

                                    switch (bdn) {
                                        case "S":
                                        case "M":
                                        case "L":
                                        case "XL":
                                            System.out.print(bdn + " bedeni seçtiğinizi görüyorum");
                                            int adet = 243;

                                            System.out.println(adet + " adet vardır. ");
                                            double fiyat = 899.99;
                                            System.out.println(reyon + " reyonundan " + giyim + " " + mrk + " " + mdl + " modelini " + rnk + " " + bdn + " bedenden tercih etmişsiniz.");

                                            System.out.println(fiyat + " TL onaylıyor musunuz: ");
                                            String onay = input.nextLine();

                                            System.out.println("Siparişinizi onaylıyoruz...");
                                            System.out.println("Siparişiniz verilmiştir.");

                                            System.out.println(ev + " bu adrese 5 gün içinde ulaşılacaktır.");
                                            break;
                                        case "XXL":
                                            System.out.println("XXL bedeni seçtiğinizi görüyorum");
                                            int adedi = 3000;

                                            System.out.println(adedi + " adet vardır. ");
                                            double fiyat1 = 999.99;

                                            System.out.println(reyon + " reyonundan " + giyim + " " + mrk + " " + mdl + " modelini " + rnk + " " + bdn + " tercih etmişsiniz.");

                                            System.out.print(fiyat1 + " TL onaylıyor musunuz: ");
                                            String onay1 = input.nextLine();

                                            System.out.println("Siparişinizi onaylıyoruz...");
                                            System.out.println("Siparişiniz verilmiştir.");

                                            System.out.println(ev + " bu adrese 5 gün içinde ulaşılacaktır.");

                                            System.out.println("Çıkış yapılıyor...");
                                            break;
                                        default:
                                            System.out.println("Şu anda elimizde bu beden bulunamamaktadır. Başka bedenlere göz atabilirsiniz.");
                                    }
                                    break;
                                default:
                                    System.out.println("Böyle bir model elimizde kalmamıştır. Başka modellerimize göz atabilirsiniz.");
                            }
                            break;
                        default:
                            System.out.println("Şu anda bu kategoride ürün elimizde kalmamıştır.");
                    }
                    break;
                case "Alt giyim":
                    System.out.print("Bu kategoriden hangi ürünü almak istiyorsunuz: ");
                    String urn = input.nextLine();

                    switch (urn) {
                        case "Ayakkabı":
                        case "Terlik":
                            System.out.print("Bu seçtiğiniz kategoriden hangi ürünü seçmek istersiniz: ");
                            String mdl1 = input.nextLine();
                            switch (mdl1) {
                                case "Spor":
                                case "Topuklu":
                                case "Krampon":
                                case "Parmak Arası":
                                    System.out.print(mdl1 + " Bu ürünün hangi markası olanını istiyorsunuz: ");
                                    String dark = input.nextLine();

                                    System.out.print(dark + " markasının hangi rengini tercih edersiniz: ");
                                    String clr = input.nextLine();

                                    System.out.print("Bu ürünün hangi numarası daha uygundur sizin için: ");
                                    int nmr = input.nextInt();
                                    input.nextLine();

                                    switch (nmr) {
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                            System.out.println(nmr + " numaradan " + mdl1 + " stokta bulunuyor.");

                                            double fiyat1 = 1499.99;

                                            System.out.println("Siparişiniz: \n"
                                                    + urn + " kategorisinden \n"
                                                    + mdl1 + " bu modelin \n"
                                                    + dark + " markasından \n"
                                                    + clr + " rengini \n"
                                                    + nmr + " numarasından \n"
                                                    + "sipariş ettiğinizi görüntülemekteyim.");
                                            System.out.println(fiyat1 + " fiyatı onaylıyor musunuz: ");
                                            String ony = input.nextLine();

                                            System.out.println(ony + " işleminiz gerçekleştiriliyor... ");
                                            System.out.println("Siparişiniz onaylanmıştır. 5 gün içinde " + ev + " adresinizde olacaktır.");

                                            break;
                                        default:
                                            System.out.println("Böyle bir numara şu anda stoklarımızda bulunmuyor \nBaşka numaralara bakabilirsiniz.");
                                    }
                                    break;
                                default:
                                    System.out.println("Böyle bir model şu anda stoklarımızda bulunmuyor \nBaşka modellerimize bakabilirsiniz.");
                            }
                            break;
                        default:
                            System.out.println("Böyle bir ürün şu anda stoklarımızda bulunmuyor \nBaşka ürünlere bakabilirsiniz.");
                    }
                    break;
                default:
                    System.out.println("Böyle bir kategorimiz şu anda stoklarımızda bulunmuyor \nBaşka kategorilere bakabilirsiniz.");
            }
        }
    }

