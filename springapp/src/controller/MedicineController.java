@RestController
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping("/medicines")
    public ResponseEntity<Boolean> addMedicine(@RequestBody Medicine medicine) {
        boolean isMedicineAdded = medicineService.addMedicine(medicine);
        return ResponseEntity.ok(isMedicineAdded);
    }

    @PutMapping("/medicines/{medicineId}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable int medicineId, @RequestBody Medicine medicine) {
        Medicine updatedMedicine = medicineService.updateMedicine(medicineId, medicine);
        return ResponseEntity.ok(updatedMedicine);
    }
}